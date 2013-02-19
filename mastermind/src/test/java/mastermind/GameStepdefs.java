package mastermind;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.PendingException;
import org.hamcrest.core.Is;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class GameStepdefs {

  private Game game;
  private String secret;
  private int rows = 10;

  @Given("^a secret (.*)$")
  public void secret(String secret) throws Throwable {
    this.secret = secret;
  }

  @When("^guessing (.*)$")
  public void I_guess(String guess) throws Throwable {
    getGame().guess(guess);
  }

  @Then("^I win$")
  public void I_win() throws Throwable {
    assertTrue(getGame().isSolved());
  }

  @Given("^(\\d+) rows$")
  public void rows(int numberOfRows) throws Throwable {
    rows = numberOfRows;
  }

  @Then("^I lose$")
  public void I_lose() throws Throwable {
    assertThat(true, is(getGame().isLost()));
  }

  private Game getGame() {
    if (game == null) {
      game = new Game(secret,rows);
    }
    return game;
  }
}
