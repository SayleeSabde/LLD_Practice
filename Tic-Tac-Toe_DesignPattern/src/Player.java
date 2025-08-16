public abstract class Player implements PlayerBehavior {
    protected final String playerName;
    private int ranking;
    protected final char symbol;

    public Player(String playerName, char symbol) {
        this.playerName = playerName;
        this.symbol = symbol;
    }

    public String getPlayerName() {
        return playerName;
    }

    public char getSymbol() {
        return symbol;
    }

    public void updateRanking(int ranking) {
        this.ranking = ranking;
    }
}
