package mastermind;

/**
 * Handles game domain events
 */
public interface GameProgressHandler {
    void guessProcessed(Object guess, Object key);

    void gameCompleted(boolean solved, int pointsScored);
}
