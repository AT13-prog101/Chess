package src.Views;

import com.google.common.collect.Table;
import src.Chessboard;
import src.Game;
import src.Pieces.Piece;
import src.Position;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
    private final Color lightColor = new Color(255, 232, 208);
    private final Color darkColor = new Color(196, 150, 105);
    private final int ASCII_CODE_LOWER_CASE_A = 97;
    private JPanel panelCentral;

    public ChessboardView(Game game) {
        this.game = game;
        setSize(830, 750);
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
        panelBottom.setPreferredSize(new Dimension(820,70));
        panelBottom.setLayout(new BoxLayout(panelBottom, BoxLayout.Y_AXIS));
        panelBottom.setBackground(colorFrame);
        JPanel colLabels = new JPanel();
        JPanel firstPlayer = new JPanel();
        colLabels.setPreferredSize(new Dimension(820, 30));
        firstPlayer.setPreferredSize(new Dimension(820, 40));
        colLabels.setLayout(new FlowLayout(FlowLayout.LEFT));
        colLabels.setBackground(colorFrame);
        firstPlayer.setBackground(colorFrame);
        panelBottom.add(colLabels);
        panelBottom.add(firstPlayer);
        JLabel labelCorner = new JLabel();
        labelCorner.setPreferredSize(new Dimension(20,30));
        labelCorner.setForeground(colorPositionLabels);
        colLabels.add(labelCorner);

        JPanel panelLeft = new JPanel();
        panelLeft.setPreferredSize(new Dimension(30,640));
        panelLeft.setLayout(new BoxLayout(panelLeft, BoxLayout.Y_AXIS));
        panelLeft.setBackground(colorFrame);

        JPanel panelRight = new JPanel();
        panelRight.setPreferredSize(new Dimension(160,640));
        panelRight.setBackground(colorFrame);

        this.panelCentral = new JPanel();
        this.panelCentral.setLayout(new GridLayout(Chessboard.DIMENSION, Chessboard.DIMENSION));
        this.panelCentral.setPreferredSize(new Dimension(640, 640));

        for (int i = Chessboard.DIMENSION; i > 0; i--) {
            JLabel label = new JLabel();
            label.setPreferredSize(new Dimension(30,80));
            label.setText(String.valueOf(" " + i));
            label.setForeground(colorPositionLabels);
            label.setFont(new Font("Verdana", Font.BOLD, 12));
            panelLeft.add(label);

            JLabel labelCol = new JLabel();
            labelCol.setPreferredSize(new Dimension(75,30));
            labelCol.setText("       " + String.valueOf(Character.toString(ASCII_CODE_LOWER_CASE_A + (8 - i))));
            labelCol.setForeground(colorPositionLabels);
            labelCol.setFont(new Font("Verdana", Font.BOLD, 12));
            colLabels.add(labelCol);
        }

        addCellsToBoard();
        add(panelCentral,BorderLayout.CENTER);
        add(panelTop,BorderLayout.NORTH);
        add(panelBottom,BorderLayout.SOUTH);
        add(panelLeft,BorderLayout.WEST);
        add(panelRight,BorderLayout.EAST);
        initializeChessboard();
    }
    public void addCellsToBoard() {
        boolean lightColorCell = true;
        for (int row = 0; row < Chessboard.DIMENSION; row++) {
            for (int col = 0; col < Chessboard.DIMENSION; col++) {
                JLabel cell = new JLabel();
                cell.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {

                    }
                });
                cell.setPreferredSize(new Dimension(80, 80));
                if (lightColorCell) {
                    cell.setBackground(lightColor);
                } else {
                    cell.setBackground(darkColor);
                }
                lightColorCell = !lightColorCell;
                if (col == Chessboard.DIMENSION - 1) {
                    lightColorCell = !lightColorCell;
                }
                cell.setOpaque(true);
                board[row][col] = cell;
                this.panelCentral.add(cell);
            }
        }
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
