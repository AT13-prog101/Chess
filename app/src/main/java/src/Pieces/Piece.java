package src.Pieces;

import src.MovePiece;
import src.Position;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Piece {
    public ImageIcon image;
    private char color;
    private boolean isWhite;
    private char figure;
    private int posX;
    private int posY;
    private boolean isCaptured;
    private boolean isMoved;
    private List<MovePiece> moveTypes = new ArrayList<MovePiece>();

    public Piece(boolean white, int posX, int posY) {
        this.isWhite = white;
        this.isCaptured = false;
        this.posX = posX;
        this.posY = posY;
        this.isMoved = false;
        this.color=white? 'W':'B';
    }

    public void setCaptured(boolean isCaptured) {
        this.isCaptured = isCaptured;
    }

    public boolean isCaptured() {
        return this.isCaptured;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
    public char getFigure() {
        return this.figure;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
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

    public char getColor() {
        return color;
    }

    public void setImage(String dir) {
        this.image = new ImageIcon(dir);
    }
    public ImageIcon getImage() {
        return image;
    }

    public void updatePosition(int x, int y) {
        this.posX = x;
        this.posY = y;
        this.isMoved = true;
    }
    public List<Position> getValidMoves() {
        List<Position> validMoves = new ArrayList<Position>();
        for (MovePiece movePiece : moveTypes) {
            validMoves.addAll(movePiece.getPossibleMoves(this));
        }
        return validMoves;
    }
}