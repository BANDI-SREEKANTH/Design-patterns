package lldexamples.tictactoe;

public class Board {
    private final int rows;
    private final int columns;
    private Symbol[][] grid;

    /* Extensibility that we support the different sizes of board
    public Board(int size)
    {
        grid=new Symbol[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = Symbol.EMPTY;
            }
        }
    }


     */
    public Board(int rows, int columns) {
        // initially the board of each grid cell having EMPTY
        this.rows = rows;
        this.columns = columns;
        grid = new Symbol[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                grid[i][j] = Symbol.EMPTY;
            }
        }
    }
    // Checks if a given position is within the bounds of the board.
    public boolean isValidMove(Position pos) {
        return pos.row >= 0 && pos.row < rows && pos.col >= 0 && pos.col < columns
                && grid[pos.row][pos.col] == Symbol.EMPTY;
    }
    // Allows players to make their moves
    public void makeMove(Position pos, Symbol symbol) {
        grid[pos.row][pos.col] = symbol;
    }
    // Determines the current state of the game by checking for
    // Rows, Columns and Diagonals for winning conditions
    public void checkGameState(Player currentPlayer,GameContext context) {
        for (int i = 0; i < rows; i++) {
            if (grid[i][0] != Symbol.EMPTY && isWinningLine(grid[i])) {
                context.next(currentPlayer, true);
                return;
            }
        }
        for (int i = 0; i < columns; i++) {
            Symbol[] column = new Symbol[rows];
            for (int j = 0; j < rows; j++) {
                column[j] = grid[j][i];
            }
            if (column[0] != Symbol.EMPTY && isWinningLine(column)) {
                context.next(currentPlayer, true);
                return;
            }
        }
        Symbol[] diagonal1 = new Symbol[Math.min(rows, columns)];
        Symbol[] diagonal2 = new Symbol[Math.min(rows, columns)];
        for (int i = 0; i < Math.min(rows, columns); i++) {
            diagonal1[i] = grid[i][i];
            diagonal2[i] = grid[i][columns - 1 - i];
        }
        if (diagonal1[0] != Symbol.EMPTY && isWinningLine(diagonal1)) {
            context.next(currentPlayer, true);
            return;
        }
        if (diagonal2[0] != Symbol.EMPTY && isWinningLine(diagonal2)) {
            context.next(currentPlayer, true);
            return;
        }
        // Additional logic to handle a draw or continue in progress can be added
        // here
    }
    private boolean isWinningLine(Symbol[] line) {
        Symbol first = line[0];
        for (Symbol s : line) {
            if (s != first) {
                return false;
            }
        }
        return true;
    }
    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Symbol symbol = grid[i][j];
                switch (symbol) {
                    case X:
                        System.out.print(" X ");
                        break;
                    case O:
                        System.out.print(" O ");
                        break;
                    case EMPTY:
                    default:
                        System.out.print(" . ");
                }
                if (j < columns - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < rows - 1) {
                System.out.println("---+---+---");
            }
        }
        System.out.println();
    }
}