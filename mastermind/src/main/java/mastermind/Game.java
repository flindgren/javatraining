package mastermind;

public class Game implements Runnable {
    private final CodeMaker maker;
    private final CodeBreaker breaker;
    private final GameProgressHandler progressHandler;
    private final GameConfiguration gameConfiguration;

    public Game(CodeMaker maker, CodeBreaker breaker, GameProgressHandler progressHandler, GameConfiguration gameConfiguration) {
        this.maker = maker;
        this.breaker = breaker;
        this.progressHandler = progressHandler;
        this.gameConfiguration = gameConfiguration;
    }

    @Override
    public void run() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
