package src;

import src.Pieces.*;

public class GetPieceFactory {
    public GetPieceFactory() {

    }

    /**
     * Creates a Piece given the parameters name, isWhite, posX and posY
     *
     */
    public Piece getPiece(String name, char color, int posX, int posY) {
        Piece piece = null;
        switch (name) {
            case "Rook": piece = new Rook(color, posX, posY);
            break;
            case "Bishop": piece = new Bishop(color, posX, posY);
                break;
            case "Horse": piece = new Horse(color, posX, posY);
                break;
            case "Queen": piece = new Queen(color, posX, posY);
                break;
            case "King": piece = new King(color, posX, posY);
                break;
            case "Pawn": piece = new Pawn(color, posX, posY);
                break;
        }
        return piece;
    }
}
