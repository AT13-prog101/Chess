package src.Pieces;

import src.KnightMove;

public class Horse extends Piece{
    private char figure = 'H';
    private final String BLACK_KNIGHT_DIR = "src/main/resources/BlackKnight.png";
    private final String WHITE_KNIGHT_DIR = "src/main/resources/WhiteKnight.png";
    public Horse(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
        if (white == true) {
            setColor('W');
            setImage(WHITE_KNIGHT_DIR);
        } else
        {
            setColor('B');
            setImage(BLACK_KNIGHT_DIR);
        }
        addMoveType(new KnightMove());
    }
    public char getFigure() {
        return this.figure;
    }
}
