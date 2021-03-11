package src;

public abstract class Piece {
    private boolean isWhite;
    private int initPosX;
    private int initPosY;
    private boolean isCaptured;
    //private MovePiece move;

    public Piece(boolean white, int initPosX, int initPosY) {
        this.isWhite = white;
        this.isCaptured = false;
        this.initPosX = initPosX;
        this.initPosY = initPosY;
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
    public int getInitPosX() {
        return initPosX;
    }

    /**
     * Set initial position in X of Piece when the piece is moved
     * @param initPosX
     */
    public void setInitPosX(int initPosX) {
        this.initPosX = initPosX;
    }

    /**
     * Return initial position in Y of Piece
     * @return initPosY
     */
    public int getInitPosY() {
        return initPosY;
    }

    /**
     * Set initial position in Y of Piece when the piece is moved
     * @param initPosY
     */
    public void setInitPosY(int initPosY) {
        this.initPosY = initPosY;
    }

    /**
     * Control if the moved made by the piece is valid or not
     * @return true when position is valid.
     */
    /* public boolean isValidMove(int endPosX, int endPosY) {
        if (move(endPosX, endPosY)) {
            this.initPosX = endPosX;
            this.initPosY = endPosY;
            return true;
        }
        return false;
    }
    */
}