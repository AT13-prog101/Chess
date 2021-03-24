package src.Pieces;

import src.PiecesMoves.PawnMove;
import src.Position;

public class Pawn extends Piece{
    private char figure = 'P';
    private final String WHITE_PAWN_DIR = "src/main/resources/WhitePawn.png";
    private final String BLACK_PAWN_DIR = "src/main/resources/BlackPawn.png";
    public Pawn(boolean white, Position position) {
        super(white, position);
        if (white == true) {
            setImage(WHITE_PAWN_DIR);
        } else {
            setImage(BLACK_PAWN_DIR);
        }
        addMoveType(new PawnMove());
    }
    public char getFigure() {
        return this.figure;
    }
}
