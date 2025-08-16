public class Board {
  private final char[][] grid;
  private final int boardSize;

  public Board(int size) {
    boardSize = size;
    grid = new char[boardSize][boardSize];
    initializeBoard();
  }

  public int getBoardSize() {
    return boardSize;
  }

  // Initialize board with empty spaces
  private void initializeBoard() {
    for (int i = 0; i < boardSize; i++) {
      for (int j = 0; j < boardSize; j++) {
        grid[i][j] = ' ';
      }
    }
  }

  // Display the board
  public void printBoard() {
    System.out.println("\nCurrent Board:");
    for (int i = 0; i < boardSize; i++) {
      for (int j = 0; j < boardSize; j++) {
        System.out.print(" " + grid[i][j]);
        if (j < boardSize - 1) System.out.print(" |");
      }
      System.out.println();
      if (i < boardSize - 1) System.out.println("---+---+---");
    }
  }

  public void makeMove(int row, int col, char symbol) {
    if (isValidMove(row, col)) {
      grid[row][col] = symbol;
    } else {
      System.out.println("Move is invalid, retry");
    }
  }

  public int getRow(int position) {
    return (position-1)/boardSize;
  }

  public int getCol(int position) {
    return (position-1)%boardSize;
  }

  private boolean isValidMove(int row, int col) {
    return row >= 0 && row < boardSize &&
        col >= 0 && col < boardSize &&
        grid[row][col] == ' ';
  }

  public boolean checkWin(int row, int col, char symbol) {
    // Check rows
    boolean rowWin = true;
    for (int i = 0; i < boardSize; i++) {
     if (grid[row][i] != symbol) {
       rowWin = false;
       break;
     }
    }
    if (rowWin) return true;

    // Check columns
    boolean colWin = true;
    for (int i = 0; i < boardSize; i++) {
      if (grid[i][col] != symbol) {
        colWin = false;
        break;
      }
    }
    if (colWin) return true;

    // Check main diagonal
    if (row == col) {
      boolean mainDiagonalWin = true;
      for (int i = 0; i < boardSize; i++) {
        if (grid[i][i] != symbol) {
          mainDiagonalWin = false;
          break;
        }
      }
      if (mainDiagonalWin) return true;
    }

    // Check anti-diagonal

    if (row + col == boardSize-1) {
      boolean antiDiagonalWin = true;
      for (int i = 0; i < boardSize; i++) {
        if (grid[i][boardSize - 1 - i] != symbol) {
          antiDiagonalWin = false;
          break;
        }
      }
      return antiDiagonalWin;

    }
    return false;
  }




}
