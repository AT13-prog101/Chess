package src.Pieces;

import src.PiecesMoves.KnightMove;
import src.Utilities.Position;

public class Horse extends Piece {
    private char figure = 'H';
    /**
     *Class to start a Horse.
     */
    public Horse(final boolean white, final Position position) {
        super(white, position);
        addMoveType(new KnightMove());
    }
    /**
     * @return figure Class to get the figure.
     */
    public char getFigure() {
        return this.figure;
    }
}
