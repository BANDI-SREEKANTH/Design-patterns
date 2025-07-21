package lldexamples.chessgame;

public class Board {
    private static Board instance;
    private Cell[][] board;
    private Board(int rows)
    {
        initalizeBoard(rows);
    }
    // method to get single instance using a singleton design pattern

    public static Board getInstance(int rows) {
        if(instance==null)
        {
            instance = new Board(rows);
        }
        return instance;
    }
    private void initalizeBoard(int rows)
    {
        board=new Cell[rows][rows];

        // setting white pieces in the first row
        setPieceRow(0,true);
        // setting white paws in the second row
        setPawnRow(1,rows,true); // which row to put pawn and rows define row with rows cols?
        // Setting black pieces in the last row
        setPieceRow(rows-1,false);
        // setting black pieces in last row-1 (black pawns)
        setPawnRow(rows-2,rows,false);

        // Putting all the remaining cells with null
        for(int row=2;row<rows-2;row++)
        {
            for(int col=0;col<rows;col++)
            {
                board[row][col]=new Cell(row,col,null);
            }
        }

    }
    // Set the major pieces for a given row
    private void setPieceRow(int row, boolean isWhite) {
        board[row][0] = new Cell(row, 0, PieceFactory.createPiece("rook", isWhite));
        board[row][1] =
                new Cell(row, 1, PieceFactory.createPiece("knight", isWhite));
        board[row][2] =
                new Cell(row, 2, PieceFactory.createPiece("bishop", isWhite));
        board[row][3] =
                new Cell(row, 3, PieceFactory.createPiece("queen", isWhite));
        board[row][4] = new Cell(row, 4, PieceFactory.createPiece("king", isWhite));
        board[row][5] =
                new Cell(row, 5, PieceFactory.createPiece("bishop", isWhite));
        board[row][6] =
                new Cell(row, 6, PieceFactory.createPiece("knight", isWhite));
        board[row][7] = new Cell(row, 7, PieceFactory.createPiece("rook", isWhite));
    }
    // Set pawns for a given row
    private void setPawnRow(int row, int rows, boolean isWhite) {
        for (int j = 0; j < rows; j++) {
            board[row][j] =
                    new Cell(row, j, PieceFactory.createPiece("pawn", isWhite));
        }
    }
}
