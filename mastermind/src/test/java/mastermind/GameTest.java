package mastermind;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GameTest {

  public static final String SECRET = "ABCD";
  private Game game;

  @Before
  public void setUp() throws Exception {
    game = new Game(SECRET);
  }

  @Test
  public void freshGameIsNotSolved() {
    assertFalse(game.isSolved());
  }

  @Test
  public void freshGameIsNotLost() {
    assertFalse(game.isLost());
  }

  @Test
  public void correctGuessSolvesGame() {
    game.guess(SECRET);
    assertTrue(game.isSolved());
  }

  @Test
  public void gameIsLostWhenNoMoreRowsRemain() {
    Game shortGame = new Game(SECRET,1).guess("XXXX");
    assertTrue(shortGame.isLost());
  }

  @Test
  public void gameIsNotLostIfLastGuessSolvesGame() {
    Game shortGame = new Game(SECRET,1).guess(SECRET);
    assertFalse(shortGame.isLost());
  }






}
