package src.Views;

import src.Chessboard;
import src.Game;
import src.Pieces.Piece;
import src.Position;
import java.util.List;
import javax.swing.*;
import java.awt.*;

public class ChessboardView extends JFrame {
    private static final int SIZE_IMAGE = 80;
    private static final int SIZE_WINDOW_WIDTH = Chessboard.DIMENSION * SIZE_IMAGE;
    private static final int SIZE_WINDOW_HEIGHT = Chessboard.DIMENSION * SIZE_IMAGE;
    private static JLabel[][] board = new JLabel[Chessboard.DIMENSION][Chessboard.DIMENSION];
    private Game game;
    private Color colorFrame = new Color(96, 96, 96);
    private Color colorPositionLabels = new Color(224, 224, 224);

    public ChessboardView(Game game) {
        this.game = game;
        setSize(820, 740);
        setTitle("AT13-CHESS");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFocusable(true);
        setVisible(true);
        //setLayout(new GridLayout(Chessboard.DIMENSION, Chessboard.DIMENSION));
        setLayout(new BorderLayout());

        JPanel panelTop;
        panelTop = new JPanel();
        panelTop.setPreferredSize(new Dimension(820,40));
        panelTop.setBackground(colorFrame);

        JPanel panelBottom;
        panelBottom = new JPanel();
        panelBottom.setPreferredSize(new Dimension(820,60));
        panelBottom.setBackground(colorFrame);

        JPanel panelLeft = new JPanel();
        panelLeft.setPreferredSize(new Dimension(20,640));
        panelLeft.setLayout(new BoxLayout(panelLeft, BoxLayout.Y_AXIS));
        panelLeft.setBackground(colorFrame);

        JPanel panelRight = new JPanel();
        panelRight.setPreferredSize(new Dimension(160,640));
        panelRight.setBackground(colorFrame);

        JPanel panelCentral = new JPanel();
        panelCentral.setPreferredSize(new Dimension(640, 640));

        for (int i = Chessboard.DIMENSION; i > 0; i--) {
            JLabel label = new JLabel();
            label.setPreferredSize(new Dimension(20,80));
            label.setText(String.valueOf(" " + i));
            label.setForeground(colorPositionLabels);
            label.setFont(new Font("Verdana", Font.BOLD, 14));
            panelLeft.add(label);
            
        }

        add(panelCentral,BorderLayout.CENTER);
        add(panelTop,BorderLayout.NORTH);
        add(panelBottom,BorderLayout.SOUTH);
        add(panelLeft,BorderLayout.WEST);
        add(panelRight,BorderLayout.EAST);
        initializeChessboard();
    }
    public void initializeChessboard() {

    }
    public void updateChessboard() {
        for (int row = 0; row < Chessboard.DIMENSION; row++) {
            for (int col = 0; col < Chessboard.DIMENSION; col++) {
            }
        }
    }
}
