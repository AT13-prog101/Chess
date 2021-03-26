package src.Pieces;

import src.PiecesMoves.DiagonalsMove;
import src.PiecesMoves.LinedMove;
import src.Utilities.Position;

public class Queen extends Piece {
    private char figure = 'Q';
    /**
     *Class to start a Queen.
     */
    public Queen(final boolean white, final Position position) {
        super(white, position);
        addMoveType(new DiagonalsMove());
        addMoveType(new LinedMove());
    }
    /**
     * @return figure Class to get the figure.
     */
    public char getFigure() {
        return this.figure;
    }
}
