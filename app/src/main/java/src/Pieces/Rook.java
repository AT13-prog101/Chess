package src.Pieces;

import src.PiecesMoves.LinedMove;
import src.Position;

public class Rook extends Piece{
    private char figure = 'R';
    private final String WHITE_ROOK_DIR = "src/main/resources/WhiteRook.png";
    private final String BLACK_ROOK_DIR = "src/main/resources/BlackRook.png";
    public Rook(boolean white, Position position) {
        super(white, position);
        if (white == true) {
            setImage(WHITE_ROOK_DIR);
        } else {
            setImage(BLACK_ROOK_DIR);
        }
        addMoveType(new LinedMove());
    }
    public char getFigure() {
        return this.figure;
    }
}
