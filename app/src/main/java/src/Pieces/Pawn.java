package src.Pieces;

import src.PiecesMoves.PawnMove;
import src.Utilities.Position;

public class Pawn extends Piece {
    private char figure = 'P';
    /**
     *Class to start a Pawn.
     */
    public Pawn(final boolean white, final Position position) {
        super(white, position);
        addMoveType(new PawnMove());
    }
    /**
     * @return figure Class to get the figure.
     */
    public char getFigure() {
        return this.figure;
    }
}
