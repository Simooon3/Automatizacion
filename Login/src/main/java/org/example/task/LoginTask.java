package org.example.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.example.interaction.ClearAndEnterValue;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.example.userInterface.BaseUI.*;

public class LoginTask implements Task {

    private final String username;
    private final String password;

    public LoginTask(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static LoginTask withCredentials(String username, String password) {
        return instrumented(LoginTask.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                net.serenitybdd.screenplay.actions.Enter.theValue(username).into(USERNAME_FIELD),
                net.serenitybdd.screenplay.actions.Enter.theValue(password).into(PASSWORD_FIELD),
                WaitForSeconds.of(1),

                Click.on(LOGIN_BUTTON),
                WaitForSeconds.of(2),

                Click.on(MY_INFO_MENU),
                WaitForSeconds.of(1),

                ClearAndEnterValue.intoField(FIRST_NAME_FIELD, "Simon"),
                WaitForSeconds.of(1),

                ClearAndEnterValue.intoField(LAST_NAME_FIELD, "Mesa"),
                WaitForSeconds.of(1),

                Click.on(SAVE_BUTTON),
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
                Thread.currentThread().interrupt();
            }
        }
    }
}
