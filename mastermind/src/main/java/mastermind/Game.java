package mastermind;

public class Game {
    private final String secret;
    private String guess;

    public Game(String secret) {
        this.secret = secret;
    }

    public void guess(String guess) {
        this.guess = guess;
    }

    public boolean isSolved() {
        return secret.equals(guess);
    }
}
