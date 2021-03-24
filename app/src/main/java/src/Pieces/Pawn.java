package src.Pieces;

<<<<<<< HEAD
import src.PiecesMoves.PawnMove;

public class Pawn extends Piece{
    private char figure = 'P';
    private final String BLACK_PAWN_DIR = "src/main/resources/BlackPawn.png";
    private final String WHITE_PAWN_DIR = "src/main/resources/WhitePawn.png";
    public Pawn(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
        if (white == true) {
            setImage(WHITE_PAWN_DIR);
        } else {
            setImage(BLACK_PAWN_DIR);
        }
=======
import src.PawnMove;
import src.Position;

public class Pawn extends Piece{
    private char figure = 'P';
    public Pawn(boolean white, Position position) {
        super(white, position);

>>>>>>> dev
        addMoveType(new PawnMove());
    }
    public char getFigure() {
        return this.figure;
    }
}
