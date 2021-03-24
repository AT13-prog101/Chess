package src.Pieces;

import src.PiecesMoves.KnightMove;
import src.Position;

public class Horse extends Piece{
    private char figure = 'H';
    private final String WHITE_KNIGHT_DIR = "src/main/resources/WhiteKnight.png";
    private final String BLACK_KNIGHT_DIR = "src/main/resources/BlackKnight.png";
    public Horse(boolean white, Position position) {
        super(white, position);
        if (white == true) {
            setImage(WHITE_KNIGHT_DIR);
        } else {
            setImage(BLACK_KNIGHT_DIR);
        }
        addMoveType(new KnightMove());
    }
    public char getFigure() {
        return this.figure;
    }
}
