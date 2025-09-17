package stepsDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.example.task.LoginTask;

public class LoginStep {

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
    }

    @Given("the user is on the login page")
    public void userIsOnLoginPage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User").attemptsTo(
                Open.url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
        );
    }

    @When("the user logs in with valid credentials")
    public void userLogsIn() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginTask.withCredentials("Admin", "admin123")
        );
    }

    @Then("the personal information should be updated successfully")
    public void personalInfoUpdatedSuccessfully() {
        // Aquí implementa la verificación (Questions) cuando quieras
    }
}
