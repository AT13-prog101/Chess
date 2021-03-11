package src;

public abstract class Piece {
    private boolean isWhite;
    private int initPosX;
    private int initPosY;
    private int finPosX;
    private int finPosY;
    private boolean isCaptured;
    //private Move move;

    public Piece(boolean white, int initPosX, int initPosY) {
        this.isWhite = white;
        this.isCaptured = false;
        this.initPosX = initPosX;
        this.initPosY = initPosY;
    }

    public void setCaptured(boolean isCaptured) {
        this.isCaptured = isCaptured;
    }

    public boolean isCaptured() {
        return this.isCaptured;
    }

    public int getInitPosX() {
        return initPosX;
    }

    public int getInitPosY() {
        return initPosY;
    }
}