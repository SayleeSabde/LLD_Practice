import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Game {

  private final Board board;
  private final Queue<Player> playerQueue;
  private final Scanner scanner;

  public Game(Player player1, Player player2, int size) {
    board = new Board(size);
    playerQueue = new LinkedList<>();
    playerQueue.add(player1);
    playerQueue.add(player2);
    scanner = new Scanner(System.in);
  }

  /**
   * Method to start the game.
   */
  public void startGame() {
    int count = 0; //if no.of moves > board size*boardsize then draw

    while (true) {
      count++;
      if (count > (board.getBoardSize()*board.getBoardSize())) {
        System.out.println("Its a Draw!!");
        break;
      }

      Player currentPlayer = playerQueue.poll();
      System.out.println("Board before move: ");
      board.printBoard();
      System.out.println("Provide Position to make move (1 to N)");
      int position = scanner.nextInt();
      int row = board.getRow(position);
      int col = board.getCol(position);

      assert currentPlayer != null;
      board.makeMove(row, col, currentPlayer.getSymbol());

      System.out.println("Board after move: ");
      board.printBoard();

      if (board.checkWin(row, col, currentPlayer.getSymbol())) {
        System.out.println(currentPlayer.getPlayerName() + " is the winner");
        currentPlayer.updateRanking(1);
        break;
      }
      playerQueue.offer(currentPlayer);
    }
  }

}
