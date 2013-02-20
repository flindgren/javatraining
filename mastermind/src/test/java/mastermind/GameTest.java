package mastermind;

import org.junit.Test;


public class GameTest {

    public static final String SECRET = "ABCD";

    @Test
    public void creatingGameHasNoSideEffects() {
        CodeMaker maker = null;
        CodeBreaker breaker = null;
        GameProgressHandler progressHandler = null;
        GameConfiguration gameConfiguration = null;

        Game game = new Game(maker, breaker, progressHandler, gameConfiguration);
    }


}
