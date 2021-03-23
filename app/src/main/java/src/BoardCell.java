package src;

import src.Pieces.Piece;

import javax.swing.*;
import java.awt.*;

public class BoardCell extends JLabel {
    private int posX;
    private int posY;
    private Piece piece;
    public BoardCell(boolean isWhite) {
        if (isWhite) {
            setBackground(Color.darkGray);
        } else {
            setBackground(Color.GRAY);
        }
        setForeground(Color.WHITE);
        setOpaque(true);
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public void setIcon() {
        if(piece != null) {
            setIcon(piece.getImage());
        }
    }
}
