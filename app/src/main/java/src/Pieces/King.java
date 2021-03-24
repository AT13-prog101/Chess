package src.Pieces;

import src.PiecesMoves.KingMove;
import src.Position;

public class King extends Piece {
    private char figure = 'K';
    private final String WHITE_KING_DIR = "src/main/resources/WhiteKing.png";
    private final String BLACK_KING_DIR = "src/main/resources/BlackKing.png";
    private boolean alive=true;
    public King(boolean white, Position position) {
        super(white, position);
        if (white == true) {
            setImage(WHITE_KING_DIR);
        } else {
            setImage(BLACK_KING_DIR);
        }
        addMoveType(new KingMove());
    }

    /**
     *
     * @return life of king
     */
    public boolean getLive(){return alive;}

    /** Change status life of king
     *
     * @return void
     */
    public void setLive(boolean changeStatusLife){ this.alive=changeStatusLife;}

    /** Return figure of king
     *
     * @return char that is figure of king
     */
    public char getFigure() {
        return this.figure;
    }
}
