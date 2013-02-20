package mastermind;

import org.junit.Test;


public class GameTest {

    public static final String SECRET = "ABCD";

    @Test
    public void creatingGameHasNoSideEffects() {
        CodeMaker maker = null;
        CodeBreaker breaker = null;
        GameListener progressHandler = null;

        Game game = new Game(maker, breaker, progressHandler);
    }


}
