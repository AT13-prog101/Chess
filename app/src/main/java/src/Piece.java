package src;

public abstract class Piece {
    private boolean isWhite;
    private int initPosX;
    private int initPosY;
    private boolean isCaptured;
    private boolean isMoved;

    //private MovePiece move;

    public Piece(boolean white, int initPosX, int initPosY) {
        this.isWhite = white;
        this.isCaptured = false;
        this.initPosX = initPosX;
        this.initPosY = initPosY;
        this.isMoved = false;
    }

    /**
     * Set boolean value to isCaptured, when a piece is captured or not
     * @param captured
     * @return isCaptured
     */
    public void setCaptured(boolean captured) {
        this.isCaptured = isCaptured;
    }

    /**
     * Return state of isCaptured
     * @return isCaptured
     */
    public boolean isCaptured() {
        return this.isCaptured;
    }

    /**
     * Return initial position in X of Piece
     * @return initPosX
     */
    public int getPosX() {
        return initPosX;
    }

    /**
     * Set initial position in X of Piece when the piece is moved
     * @param initPosX
     */
    public void setPosX(int initPosX) {
        this.initPosX = initPosX;
    }

    /**
     * Return initial position in Y of Piece
     * @return initPosY
     */
    public int getPosY() {
        return initPosY;
    }

    /**
     * Set initial position in Y of Piece when the piece is moved
     * @param initPosY
     */
    public void setPosY(int initPosY) {
        this.initPosY = initPosY;
    }

    /**
     * Control if the moved made by the piece is valid or not
     * @return true when position is valid.
     */
    public boolean getColorWhite() {
        return this.isWhite;
    }

    /**
     *  Method that returns if the Piece has moved.
     * @return isMoved
     */
    public boolean isMoved() {
        return this.isMoved;
    }

    /**
     *  Set if a piece has moved
     * @param moved
     */
    public void setIsMoved(boolean moved) {
        this.isMoved = moved;
    }
}