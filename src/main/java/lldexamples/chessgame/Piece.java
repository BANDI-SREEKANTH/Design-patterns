package lldexamples.chessgame;

public abstract class Piece {
    private boolean isWhite;
    private boolean isKilled=false;
    public Piece(boolean isWhite)
    {
        this.isWhite=isWhite;
    }
    public boolean isWhite()
    {
        return this.isWhite;
    }
    public boolean isKilled()
    {
        return this.isKilled;
    }
    public void setKilled(boolean isKilled)
    {
        this.isKilled=isKilled;
    }
}
