public class AIPlayer extends Player {
    public AIPlayer(String name, char symbol) {
        super(name, symbol);
    }

    @Override
    public int chooseMove(Board board) {
        // Simple AI: pick first available cell
        for (int i = 1; i <= board.getBoardSize() * board.getBoardSize(); i++) {
            int row = board.getRow(i);
            int col = board.getCol(i);
            if (board.isValidMove(row, col)) return i;
        }
        return -1;
    }
}