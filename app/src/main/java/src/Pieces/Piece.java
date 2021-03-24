package src.Pieces;

import src.PiecesMoves.MoveType;
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
<<<<<<< HEAD
    private String dir;
    private List<MoveType> moveTypes = new ArrayList<MoveType>();
=======
    private List<MovePiece> moveTypes = new ArrayList<>();
>>>>>>> dev

    public Piece(boolean white, Position position) {
        this.isWhite = white;
        this.isCaptured = false;
        this.posX = position.getPosX();
        this.posY = position.getPosY();
        this.isMoved = false;
        this.color = white? 'W':'B';
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

    public boolean isMoved() {
        return this.isMoved;
    }

    public void setIsMoved(boolean move) {
        this.isMoved = move;
    }

    public boolean getColorWhite() {
        return this.isWhite;
    }

    public void addMoveType(MoveType moveType) {
        this.moveTypes.add(moveType);
    }

    public char getColor() {
        return color;
    }

<<<<<<< HEAD
    public void setImage(String dir) {
        this.image = new ImageIcon(dir);
    }
    public ImageIcon getImage() {
        return image;
    }

    public void updatePosition(int x, int y) {
        this.posX = x;
        this.posY = y;
=======
    public void updatePosition(Position position) {
        this.posX = position.getPosX();
        this.posY = position.getPosY();
>>>>>>> dev
        this.isMoved = true;
    }
    public List<Position> getValidMoves() {
        List<Position> validMoves = new ArrayList<Position>();
        for (MoveType moveType : moveTypes) {
            validMoves.addAll(moveType.getPossibleMoves(this));
        }
        return validMoves;
    }
}