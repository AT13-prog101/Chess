package src.Views;

import org.checkerframework.checker.units.qual.C;
import src.Utilities.Chessboard;
import src.Utilities.Game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.management.BufferPoolMXBean;

public class Menu extends JFrame {
    private static final int SIZE_IMAGE = 80;
    private static final int SIZE_WINDOW_WIDTH = Chessboard.DIMENSION * SIZE_IMAGE;
    private static final int SIZE_WINDOW_HEIGHT = Chessboard.DIMENSION * SIZE_IMAGE;
    private Game game;
    private JPanel jContentPane = null;
    public Menu (){
        //this.game = game;
        //font
        Font f = new Font("Serif", Font.BOLD, 30);
        //header
        JPanel heading;
        heading = new JPanel();
        heading.setBackground(new Color(0, 0, 0, 80));
        heading.setBounds(0, 0, 830, 150);
        JLabel title = new JLabel("AT13 CHESS GAME");
        title.setForeground(Color.white);
        title.setBounds(200, 25, 400, 50);
        title.setFont(f);
        heading.add(title);

        //Options Panel
        JPanel options = new JPanel();
        options.setLayout(null);
        setSize(400, 350);
        options.setBackground(new Color(50, 0, 0 , 90));
        options.setBounds(210, 175, 400, 350);

        JTextField username = new JTextField("White player name");
        username.setBackground(new Color(210, 180, 140));
        username.setBounds(50, 50, 300, 50);
        options.add(username);

        JTextField username2 = new JTextField("Black Player name");
        username2.setBounds(50, 150, 300, 50);
        username2.setBackground(new Color(210, 180, 140));
        options.add(username2);

        JButton startGame = new JButton("Start game");
        startGame.setBounds(50, 250, 300, 50);
        startGame.setBackground(new Color(160, 182, 45));
        startGame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (username.getText() != null && username2.getText() != null) {
                    Game game = new Game(1, username.getText(), username2.getText());
                    setVisible(false);
                }
            }
        });
        options.add(startGame);

        setSize(830, 750);
        setTitle("AT13-CHESS");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setFocusable(true);
        ImageIcon backgroundImage = new ImageIcon("src/main/java/resources/chessBackgroundImg.jpg");
        JLabel background = new JLabel("", backgroundImage, JLabel.CENTER);
        background.setVisible(true);

        background.add(options);
        background.add(heading);
        background.setBounds(0,0,830,750);
        add(background);
        setVisible(true);

    }

}
