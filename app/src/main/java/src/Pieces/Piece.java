package src.Pieces;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public abstract class Piece {
    private char color;
    private boolean isWhite;
    private char figure;
    private int initPosX;
    private int initPosY;
    private int finPosX;
    private int finPosY;
    private boolean isCaptured;
    private ArrayList<MoveType> moveTypes = new ArrayList<MoveType>();
    //private Move move;

    public Piece(char color, int initPosX, int initPosY) {
        this.color = color;
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
    public char getColor() {
        return color;
    }
    public char getFigure() {
        return this.figure;
    }
    public void addMoveType(MoveType moveType) {
        this.moveTypes.add(moveType);
    }
    public ArrayList<String> getValidMoves(String position) {
        ArrayList<String> validMoves = new ArrayList<String>();
        for (MoveType moveType : moveTypes) {
            validMoves.addAll(moveType.getValidMoves(position));
        }
        return validMoves;
    }
}