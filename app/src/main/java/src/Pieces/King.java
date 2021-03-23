package src.Pieces;

import src.KingMove;

public class King extends Piece {
    private char figure = 'K';
    private final String BLACK_KING_DIR = "src/main/resources/BlackKing.png";
    private final String WHITE_KING_DIR = "src/main/resources/WhiteKing.png";
    private boolean alive=true;
    public King(boolean white, int initPosX, int initPosY) {
        super(white, initPosX, initPosY);
<<<<<<< HEAD
        if (white == true) {
            setColor('W');
            setImage(WHITE_KING_DIR);
        } else
        {
            setColor('B');
            setImage(BLACK_KING_DIR);
        }
=======
>>>>>>> dev
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
