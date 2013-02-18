package mastermind;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class GameStepdefs {
    private String secret;
    private String guess;

    @Given("^a game with secret (.*)$")
    public void a_game_with_secret(String secret) throws Throwable {
        this.secret = secret;
    }

    @When("^a guess is (.*)$")
    public void I_guess(String guess) throws Throwable {
        this.guess = guess;
    }

    @Then("^I win$")
    public void I_win() throws Throwable {
        assertEquals(guess, secret);
    }
}
