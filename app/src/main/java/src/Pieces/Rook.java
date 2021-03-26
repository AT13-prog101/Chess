package src.Pieces;

import src.PiecesMoves.LinedMove;
import src.Utilities.Position;

public class Rook extends Piece {
    private final char figure = 'R';
    /**
     *Class to start a bishop.
     */
    public Rook(final boolean white, final Position position) {
        super(white, position);
        addMoveType(new LinedMove());
    }
    /**
     * @return figure Class to get the figure.
     */
    public char getFigure() {
        return this.figure;
    }
}
