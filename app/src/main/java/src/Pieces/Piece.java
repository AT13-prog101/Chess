package src.Pieces;

import src.MovePiece;
import src.Position;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {
    private char color;
    private boolean isWhite;
    private char figure;
    private int initPosX;
    private int initPosY;
    private boolean isCaptured;
    private boolean isMoved;
    private List<MovePiece> moveTypes = new ArrayList<MovePiece>();

    public Piece(boolean white, int initPosX, int initPosY) {
        this.color = color;
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

    public void addMoveType(MovePiece movePiece) {
        this.moveTypes.add(movePiece);
    }

    public void setColor(char color) {
        this.color = color;
    }
    public char getColor() {
        return color;
    }

    public List<Position> getValidMoves(Position position) {
        List<Position> validMoves = new ArrayList<Position>();
        for (MovePiece movePiece : moveTypes) {
            validMoves.addAll(movePiece.getValidMoves(position, isWhite));
        }
        return validMoves;
    }
}