package org.example.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.userInterface.BaseUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AssignSalaryTask implements Task {

    public static AssignSalaryTask assign() {
        return instrumented(AssignSalaryTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BaseUI.PIM_MENU),
                WaitForSeconds.of(1),

                Enter.theValue("Peter Mac Anderson").into(BaseUI.EMPLOYEE_NAME_SEARCH),
                Click.on(BaseUI.SEARCH_BUTTON),
                WaitForSeconds.of(2),

                Click.on(BaseUI.EMPLOYEE_RESULT),
                WaitForSeconds.of(2),

                Click.on(BaseUI.SALARY_TAB),
                WaitForSeconds.of(2),

                Click.on(BaseUI.ADD_SALARY_BUTTON),
                WaitForSeconds.of(2),

                Enter.theValue("Basic Salary").into(BaseUI.SALARY_COMPONENT_INPUT),
                WaitForSeconds.of(1),

                // Pay Grade dropdown
                Click.on(BaseUI.PAY_GRADE),
                WaitForSeconds.of(1),
                Click.on(BaseUI.PAY_GRADE_OPTION_GRADE1),
                WaitForSeconds.of(1),

                // Pay Frequency dropdown
                Click.on(BaseUI.PAY_FREQUENCY),
                WaitForSeconds.of(1),
                Click.on(BaseUI.PAY_FREQUENCY_OPTION_MONTHLY),
                WaitForSeconds.of(1),

                // Currency dropdown
                Click.on(BaseUI.CURRENCY),
                WaitForSeconds.of(1),
                Click.on(BaseUI.CURRENCY_OPTION_USD),
                WaitForSeconds.of(1),

                Enter.theValue("50000").into(BaseUI.AMOUNT),
                Enter.theValue("Salario asignado automáticamente").into(BaseUI.COMMENTS),
                WaitForSeconds.of(1),

                Click.on(BaseUI.SAVE_SALARY_BUTTON),
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
