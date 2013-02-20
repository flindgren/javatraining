package mastermind;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class GameStepdefs implements CodeBreaker, CodeMaker, GameListener {

    private String secret;
    private List<String> guesses = new LinkedList<>();
    private boolean solved;

    @Given("^a secret (.*)$")
    public void secret(String secret) throws Throwable {
        this.secret = secret;
    }

    @When("^guessing (.*)$")
    public void I_guess(String guess) throws Throwable {
        guesses.add(guess);
    }

    @Then("^The code was solved$")
    public void the_code_was_solved() throws Throwable {
        new Game(this, this, this).run();
        assertTrue(solved);
    }

    @Override
    public Object guessCode(int codeSize, List availableColors) {
        return guesses.isEmpty() ? "RRRR" : guesses.remove(0);
    }

    @Override
    public Object makeSecretCode(int size, List availableColors) {
        return secret;
    }

    @Override
    public void guessProcessed(Object guess, Object key) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void gameCompleted(boolean solved, int pointsScored) {
        this.solved = solved;
    }


}
