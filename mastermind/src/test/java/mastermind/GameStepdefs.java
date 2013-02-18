package mastermind;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class GameStepdefs {

    private Game game;

    @Given("^a game with secret (.*)$")
    public void a_game_with_secret(String secret) throws Throwable {
        game = new Game(secret);
    }

    @When("^a guess is (.*)$")
    public void I_guess(String guess) throws Throwable {
        game.guess(guess);
    }

    @Then("^I win$")
    public void I_win() throws Throwable {
        assertTrue(game.isSolved());
    }
}
