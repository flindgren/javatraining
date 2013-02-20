package mastermind;

public class Game implements Runnable {
    private final CodeMaker maker;
    private final CodeBreaker breaker;
    private final GameProgressHandler progressHandler;

    public Game(CodeMaker maker, CodeBreaker breaker, GameProgressHandler progressHandler) {
        this.maker = maker;
        this.breaker = breaker;
        this.progressHandler = progressHandler;
    }

    @Override
    public void run() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
