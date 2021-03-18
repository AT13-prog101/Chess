package src;

public abstract class Piece {
    private boolean isWhite;
    private char figure;
    private int initPosX;
    private int initPosY;
    private boolean isCaptured;
    private boolean isMoved;

    public Piece(boolean white, int initPosX, int initPosY) {
        this.isWhite = white;
        this.isCaptured = false;
        this.initPosX = initPosX;
        this.initPosY = initPosY;
        this.isMoved = false;
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
    public char getFigure() {
        return this.figure;
    }

    public void setPosX(int posX) {
        this.initPosX = posX;
    }

    public void setPosY(int posY) {
        this.initPosY = posY;
    }

    public boolean isMoved() {
        return this.isMoved;
    }

    public void setIsMoved(boolean move) {
        this.isMoved = move;
    }

    public boolean getColorWhite() {
        return this.isWhite;
    }
}