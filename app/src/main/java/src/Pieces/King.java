package src.Pieces;

import src.PiecesMoves.Castling;
import src.PiecesMoves.KingMove;
import src.Utilities.Position;

public class King extends Piece {
    private char figure = 'K';
    private boolean alive=true;
    public King(boolean white, Position position) {
        super(white, position);
        addMoveType(new KingMove());
        addMoveType(new Castling());
    }

    /** Return figure of king
     *
     * @return char that is figure of king
     */
    public char getFigure() {
        return this.figure;
    }
}
