package src;

import src.Pieces.*;

public class GetPieceFactory {
    public GetPieceFactory() {

    }

    /**
     * Creates a Piece given the parameters name, isWhite, posX and posY
     *
     */
    public Piece getPiece(TypePiece name, boolean isWhite, int posX, int posY) {
        Piece piece = null;
        switch (name) {
            case ROOK: piece = new Rook(isWhite, posX, posY);
            break;
            case BISHOP: piece = new Bishop(isWhite, posX, posY);
                break;
            case HORSE: piece = new Horse(isWhite, posX, posY);
                break;
            case QUEEN: piece = new Queen(isWhite, posX, posY);
                break;
            case KING: piece = new King(isWhite, posX, posY);
                break;
            case PAWN: piece = new Pawn(isWhite, posX, posY);
                break;
        }
        return piece;
    }
}
