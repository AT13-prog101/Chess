package src.Pieces;

import src.PiecesMoves.DiagonalsMove;
import src.Position;

public class Bishop extends Piece{
    private char figure = 'B';
    private final String WHITE_BISHOP_DIR = "src/main/resources/WhiteBishop.png";
    private final String BLACK_BISHOP_DIR = "src/main/resources/BlackBishop.png";
    public Bishop(boolean white, Position position) {
        super(white, position);
        if (white == true) {
            setImage(WHITE_BISHOP_DIR);
        } else {
            setImage(BLACK_BISHOP_DIR);
        }
        addMoveType(new DiagonalsMove());
    }
    public char getFigure() {
        return this.figure;
    }
}
