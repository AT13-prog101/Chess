package src.views;

import javax.swing.*;
import java.awt.*;

public class ChessboardUI extends JFrame {
    public static final int DEFAULT_HEIGHT = 8;
    public static final int DEFAULT_WIDTH = 8;
    private static final int SIZE_IMAGE = 80;
    private static final int SCALE_WIDTH = DEFAULT_WIDTH;
    private static final int SCALE_HEIGHT = DEFAULT_HEIGHT;
    private static final int SIZE_WINDOW_WIDTH = SCALE_WIDTH * SIZE_IMAGE;
    private static final int SIZE_WINDOW_HEIGHT = SCALE_HEIGHT * SIZE_IMAGE;
    private static JLabel[][] labelArray;

    public ChessboardUI() {
        init();
    }

    public void init() {
        setSize(SIZE_WINDOW_WIDTH, SIZE_WINDOW_HEIGHT);
        setTitle("AT13-CHESS");
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFocusable(true);
        labelArray = new JLabel[SCALE_HEIGHT][SCALE_WIDTH];
        setLayout(new GridLayout(SCALE_HEIGHT, SCALE_WIDTH));
        boolean pieceWhite = true;
        for (int row = 0; row < SCALE_HEIGHT; row++) {
            for (int col = 0; col < SCALE_WIDTH; col++) {
                JLabel label = new JLabel();
                label.setForeground(Color.WHITE);
                label.setName("BoardCell");
                label.setOpaque(true);
                if(pieceWhite) {
                    label.setBackground(Color.GRAY);
                } else {
                    label.setBackground(Color.darkGray);
                }
                if (col < 7) {
                    pieceWhite = !pieceWhite;
                }
                labelArray[row][col] = label;
                add(label);
            }
        }
        //addKeyListener(this);
    }
}