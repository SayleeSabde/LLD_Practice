import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner = new Scanner(System.in);

    public HumanPlayer(String name, char symbol) {
        super(name, symbol);
    }

    @Override
    public int chooseMove(Board board) {
        System.out.println(playerName + ", enter your move (1-" + board.getBoardSize() * board.getBoardSize() + "): ");
        int move = scanner.nextInt();
        int row = board.getRow(move);
        int col = board.getCol(move);
        while (!board.isValidMove(row, col)) {
            System.out.println("Invalid move. Try again:");
            move = scanner.nextInt();
        }
        return move;

    }
}