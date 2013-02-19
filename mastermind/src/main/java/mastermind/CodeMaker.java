package mastermind;

import java.util.List;

/**
 * Performs the role of the code maker.
 */
public interface CodeMaker {
    /**
     * Creates a new code of the given size using the provided colors
     *
     * @param size            the requested size for the code.
     * @param availableColors the colors to choose from.
     * @return a new secret code
     */
    Object makeSecretCode(int size, List availableColors);
}
