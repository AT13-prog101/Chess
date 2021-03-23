package src.Pieces;

import src.LinedMove;

public class Rook extends Piece{
    private char figure = 'R';
    private final String BLACK_ROOK_DIR = "src/main/resources/BlackRook.png";
    private final String WHITE_ROOK_DIR = "src/main/resources/WhiteRook.png";
    public Rook(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
        if (white == true) {
            setColor('W');
            setImage(WHITE_ROOK_DIR);
        } else
        {
            setColor('B');
            setImage(BLACK_ROOK_DIR);
        }
        addMoveType(new LinedMove());
    }
    public char getFigure() {
        return this.figure;
    }
}
