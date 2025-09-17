package stepsDefinitions;

import io.cucumber.java.en.When;
import org.example.task.LogoutTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LogoutStep {
    @When("the user logs out from the application")
    public void the_user_logs_out_from_the_application() {
        theActorInTheSpotlight().attemptsTo(LogoutTask.perform());
    }

}
