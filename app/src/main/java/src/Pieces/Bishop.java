package src.Pieces;

import src.DiagonalsMove;

public class Bishop extends Piece{
    private char figure = 'B';
    private final String BLACK_BISHOP_DIR = "src/main/resources/BlackBishop.png";
    private final String WHITE_BISHOP_DIR = "src/main/resources/WhiteBishop.png";
    public Bishop(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
<<<<<<< HEAD
        if (white == true) {
            setColor('W');
            setImage(WHITE_BISHOP_DIR);
        } else
        {
            setColor('B');
            setImage(BLACK_BISHOP_DIR);
        }
=======
>>>>>>> dev
        addMoveType(new DiagonalsMove());
    }
    public char getFigure() {
        return this.figure;
    }
}
