package src.Views;

import src.Chessboard;
import src.Game;

import javax.swing.*;
import java.awt.*;

public class ChessboardView extends JFrame {
    private static final int SIZE_IMAGE = 80;
    private static final int SIZE_WINDOW_WIDTH = Chessboard.DIMENSION * SIZE_IMAGE;
    private static final int SIZE_WINDOW_HEIGHT = Chessboard.DIMENSION * SIZE_IMAGE;
    private static JLabel[][] board = new JLabel[Chessboard.DIMENSION][Chessboard.DIMENSION];
    private Game game;
    public ChessboardView(Game game) {
        this.game = game;
        setSize(SIZE_WINDOW_WIDTH, SIZE_WINDOW_HEIGHT);
        setTitle("AT13-CHESS");
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFocusable(true);
        setLayout(new GridLayout(Chessboard.DIMENSION, Chessboard.DIMENSION));
        initializeChessboard();
    }
    public void initializeChessboard() {
    }
    public void updateChessboard() {
    }
}
