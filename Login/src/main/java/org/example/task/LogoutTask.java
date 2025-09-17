package org.example.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.example.userInterface.BaseUI.*;

public class LogoutTask implements Task {

    public static LogoutTask perform() {
        return instrumented(LogoutTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PROFILE_DROPDOWN),
                WaitForSeconds.of(1),
                Click.on(LOGOUT_BUTTON),
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
