package src.Pieces;

import src.PiecesMoves.DiagonalsMove;
import src.Utilities.Position;

public class Bishop extends Piece {
    private final char figure = 'B';
    /**
     *Class to start a bishop.
     */
    public Bishop(final boolean white, final Position position) {
        super(white, position);
        addMoveType(new DiagonalsMove());
    }
    /**
     * @return figure Class to get the figure.
     */
    public char getFigure() {
        return this.figure;
    }
}

