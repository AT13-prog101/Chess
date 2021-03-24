package src;

import src.Pieces.*;

public class PieceFactory {
    public PieceFactory() {

    }

    /**
     * Creates a Piece given the parameters name, isWhite, posX and posY
     *
     */
    public Piece getPiece(TypePiece name, boolean isWhite, Position position) {
        Piece piece = null;
        switch (name) {
            case ROOK: piece = new Rook(isWhite, position);
            break;
            case BISHOP: piece = new Bishop(isWhite, position);
                break;
            case HORSE: piece = new Horse(isWhite, position);
                break;
            case QUEEN: piece = new Queen(isWhite, position);
                break;
            case KING: piece = new King(isWhite, position);
                break;
            case PAWN: piece = new Pawn(isWhite, position);
                break;
        }
        return piece;
    }
}
