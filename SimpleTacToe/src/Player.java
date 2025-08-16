/**
 * Player class holding all profile related information.
 */
public class Player {

  private static int counter = 0;
  private final String playerName;
  private final int playerId;
  private int ranking; //This is to maintain ranking of players if we need to implement statistics later
  private final char symbol;  // 'O' or 'X'

  /**
   * I wanted to enforce immutability for identity-related fields like name and symbol,
   * while keeping ranking mutable for future enhancements like score tracking or leaderboards.
   * @param playerName player name
   * @param symbol symbol
   */
  public Player(String playerName, char symbol) {
    this.playerName = playerName;
    this.playerId = counter++;
    this.ranking = 0; //default ranking for now
    this.symbol = symbol;
  }

  public String getPlayerName() {
    return playerName;
  }

  // Package-private method to update ranking
  void updateRanking(int newRanking) {
    this.ranking = newRanking;
  }


  public int getPlayerId() {
    return playerId;
  }

  public int getRanking() {
    return ranking;
  }

  public char getSymbol() {
    return symbol;
  }
}
