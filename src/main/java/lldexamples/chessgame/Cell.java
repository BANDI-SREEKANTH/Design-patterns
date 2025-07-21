package lldexamples.chessgame;

public class Cell {
    private int row,col;
    private String label;
    private Piece piece;
    public Cell(int row,int col,Piece piece)
    {
        this.row=row;
        this.col=col;
        this.piece=piece;
    }
    public Piece getPiece()
    {
        return this.piece;
    }
    public void setPiece(Piece piece)
    {
        this.piece=piece;
    }

}
