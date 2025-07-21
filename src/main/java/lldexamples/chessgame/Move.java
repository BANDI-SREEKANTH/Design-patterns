package lldexamples.chessgame;

public class Move {
    private Cell startCell;
    private Cell endCell;
    public Move(Cell startCell,Cell endCell)
    {
        this.startCell=startCell;
        this.endCell=endCell;
    }
    public Cell getStartCell()
    {
        return this.startCell;
    }
    public Cell getEndCell()
    {
        return this.endCell;
    }
    // if both are white pieces it is not invalid move, if it is black, the black piece will go into dead
    public boolean isValidMove()
    {
        return !(startCell.getPiece().isWhite()==endCell.getPiece().isWhite());
    }
}
