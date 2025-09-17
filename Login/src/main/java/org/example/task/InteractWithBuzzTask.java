package org.example.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.example.userInterface.BaseUI.*;

public class InteractWithBuzzTask implements Task {

    public static InteractWithBuzzTask perform() {
        return instrumented(InteractWithBuzzTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BUZZ_TAB),
                WaitForSeconds.of(2),

                Click.on(MOST_LIKED_POST_BUTTON),
                WaitForSeconds.of(2),

                Click.on(FIRST_POST_LIKE_BUTTON),
                WaitForSeconds.of(2),

                Click.on(FIRST_POST_COMMENT_BUTTON),
                WaitForSeconds.of(2),

                Enter.theValue("Excelente publicación!").into(FIRST_POST_COMMENT_INPUT).thenHit(Keys.ENTER),
                WaitForSeconds.of(10)
        );
    }

    public static class WaitForSeconds implements net.serenitybdd.screenplay.Interaction {
        private final int seconds;

        public WaitForSeconds(int seconds) {
            this.seconds = seconds;
        }

        public static WaitForSeconds of(int seconds) {
            return new WaitForSeconds(seconds);
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            try {
                Thread.sleep(seconds * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
