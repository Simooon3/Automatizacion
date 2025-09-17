package stepsDefinitions;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import org.example.task.AssignSalaryTask;

public class SalaryStep {

    @When("the user assigns a salary to the employee")
    public void assignSalaryToEmployee() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AssignSalaryTask.assign()
        );
    }
}
