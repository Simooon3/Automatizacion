package stepsDefinitions;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import org.example.task.InteractWithBuzzTask;

public class BuzzInteractionStep {

    @When("the user interacts with the most popular post in Buzz")
    public void the_user_interacts_with_the_most_popular_post_in_buzz() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                InteractWithBuzzTask.perform()
        );
    }
}

