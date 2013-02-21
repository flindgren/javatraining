package mastermind;

/**
 * Handles game domain events
 */
public interface GameListener {

    void gameStarted();
    void guessProcessed(Object guess, Object key);

    void gameCompleted(boolean solved, int pointsScored);
}
