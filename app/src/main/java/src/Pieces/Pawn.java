package src.Pieces;

import src.PawnMove;

public class Pawn extends Piece{
    private char figure = 'P';
    private final String BLACK_PAWN_DIR = "src/main/resources/BlackPawn.png";
    private final String WHITE_PAWN_DIR = "src/main/resources/WhitePawn.png";
    public Pawn(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
<<<<<<< HEAD
        if (white == true) {
            setColor('W');
            setImage(WHITE_PAWN_DIR);
        } else
        {
            setColor('B');
            setImage(BLACK_PAWN_DIR);
        }
=======

>>>>>>> dev
        addMoveType(new PawnMove());
    }
    public char getFigure() {
        return this.figure;
    }
}
