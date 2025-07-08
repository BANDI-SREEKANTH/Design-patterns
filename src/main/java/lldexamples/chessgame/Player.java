package lldexamples.chessgame;

public class Player {
    public String name;
    public boolean isWhiteSide;
    public Player(String name,boolean isWhiteSide)
    {
        this.name=name;
        this.isWhiteSide=isWhiteSide;
    }
    public String getPlayerName()
    {
        return this.name;
    }
    public boolean isWhiteSide()
    {
        return this.isWhiteSide;
    }
}
