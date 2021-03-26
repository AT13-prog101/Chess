package src.Pieces;

import src.PiecesMoves.Castling;
import src.PiecesMoves.KingMove;
import src.Utilities.Position;

public class King extends Piece {
    private final char figure = 'K';
    /**
     *Class to start a King.
     */
    public King(final boolean white, final Position position) {
        super(white, position);
        addMoveType(new KingMove());
        addMoveType(new Castling());
    }
    /**
     * @return figure Class to get the figure.
     */
    public char getFigure() {
        return this.figure;
    }
}
