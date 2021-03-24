package src.Pieces;

import src.PiecesMoves.DiagonalsMove;
import src.PiecesMoves.LinedMove;
import src.Position;

public class Queen extends Piece{
    private char figure = 'Q';
    private final String WHITE_QUEEN_DIR = "src/main/resources/WhiteQueen.png";
    private final String BLACK_QUEEN_DIR = "src/main/resources/BlackQueen.png";
    public Queen(boolean white, Position position) {
        super(white, position);
        if (white == true) {
            setImage(WHITE_QUEEN_DIR);
        } else {
            setImage(BLACK_QUEEN_DIR);
        }
        addMoveType(new DiagonalsMove());
        addMoveType(new LinedMove());
    }
    public char getFigure() {
        return this.figure;
    }
}
