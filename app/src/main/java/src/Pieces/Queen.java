package src.Pieces;

import com.sun.source.doctree.StartElementTree;
import src.DiagonalsMove;
import src.LinedMove;

public class Queen extends Piece{
    private char figure = 'Q';
    private final String BLACK_QUEEN_DIR = "src/main/resources/BlackQueen.png";
    private final String WHITE_QUEEN_DIR = "src/main/resources/WhiteQueen.png";
    public Queen(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
        if (white == true) {
            setColor('W');
            setImage(WHITE_QUEEN_DIR);
        } else
        {
            setColor('B');
            setImage(BLACK_QUEEN_DIR);
        }
        addMoveType(new DiagonalsMove());
        addMoveType(new LinedMove());
    }
    public char getFigure() {
        return this.figure;
    }
}
