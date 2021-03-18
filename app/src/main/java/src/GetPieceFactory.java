package src;

import src.Pieces.*;

public class GetPieceFactory {
    public GetPieceFactory() {

    }

    /**
     * Creates a Piece given the parameters name, isWhite, posX and posY
     *
     */
    public Piece getPiece(String name, boolean isWhite, int posX, int posY) {
        Piece piece = null;
        switch (name) {
            case "Rook": piece = new Rook(isWhite, posX, posY);
            break;
            case "Bishop": piece = new Bishop(isWhite, posX, posY);
                break;
            case "Horse": piece = new Horse(isWhite, posX, posY);
                break;
            case "Queen": piece = new Queen(isWhite, posX, posY);
                break;
            case "King": piece = new King(isWhite, posX, posY);
                break;
            case "Pawn": piece = new Pawn(isWhite, posX, posY);
                break;
        }
        return piece;
    }
}
