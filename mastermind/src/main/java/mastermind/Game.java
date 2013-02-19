package mastermind;

public class Game {
  public static final int DEFAULT_ROW_COUNT = 10;
  private final String secret;
  private int remainingRows;
  private String guess;

  public Game(String secret) {
    this(secret, DEFAULT_ROW_COUNT);
  }

  public Game(String secret, int rows) {
    this.secret = secret;
    this.remainingRows = rows;
  }

  public Game guess(String guess) {
    this.guess = guess;
    remainingRows --;
    return this;
  }

  public boolean isSolved() {
    return secret.equals(guess);
  }

  public boolean isLost() {
    return !isSolved() && remainingRows < 1;
  }
}
