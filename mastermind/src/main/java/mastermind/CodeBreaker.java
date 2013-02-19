package mastermind;

import java.util.List;

/**
 * Performs the role of the code breaker.
 */
public interface CodeBreaker {
    /**
     * Provides the next guess of the code.
     *
     * @param codeSize        the size of the code.
     * @param availableColors the colors to choose from.
     * @return a new guess to solve the secret code
     */
    Object guessCode(int codeSize, List availableColors);
}
