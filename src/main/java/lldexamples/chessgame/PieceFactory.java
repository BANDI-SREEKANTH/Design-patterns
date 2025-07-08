package lldexamples.chessgame;

public class PieceFactory {
    public static Piece createPiece(String pieceType, boolean isWhite)
    {
        switch (pieceType.toLowerCase())
        {
            case "king":
                return new King(isWhite);
            case "queen":
                return new Queen(isWhite);
            case "knight":
                return new Knight(isWhite);
            case "rook":
                return new Rook(isWhite);
            case "bishop":
                return new Bishop(isWhite);
            case "pawn":
                return new Pawn(isWhite);
            default:
                throw new IllegalArgumentException("Unknown pieceType : "+pieceType);
        }
    }
}
