package mastermind;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GameTest {
    @Test
    public void freshGameIsNotSolved() {
        assertFalse(new Game("ABCD").isSolved());
    }

    @Test
    public void correctGuessSolvesGame() {
        Game game = new Game("ABCD");
        game.guess("ABCD");
        assertTrue(game.isSolved());
    }


}
