public class Main {
  public static void main(String[] args) {
    Player humanPlayer1 =  PlayerFactory.createPlayer("human", "saylee", 'O');
    Player humanPlayer2 =  PlayerFactory.createPlayer("human", "vaishnavi", 'X');

    Game game = new Game(humanPlayer1, humanPlayer2, 3);
    game.startGame();
  }
}