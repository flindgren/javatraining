package mastermind;

import java.util.List;

public interface GameConfiguration {
    /**
     * Specifies the size of the code in number of pegs.
     * The master mind default size is 4 pegs.
     *
     * @return the configured code size
     */
    int getCodeSize();

    /**
     * Specifies the number of rows on the board.
     * The master mind default size is 10 rows.
     *
     * @return the configured board size
     */
    int getBoardSize();

    /**
     * Specifies the colors available for code making and guessing.
     *
     * @return a list of the available colors.
     */
    List getAvailableColors(); // a more specific type should be declared once the domain model has been settled

}
