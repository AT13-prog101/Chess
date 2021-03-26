package src.Views;

import src.Position;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BoardCell extends JLabel {
    private final Color lightColor = new Color(255, 232, 208);
    private final Color darkColor = new Color(196, 150, 105);
    private Position position;
    public BoardCell(boolean isLightColor, int x, int y) {
        if (isLightColor) {
            setBackground(lightColor);
        } else {
            setBackground(darkColor);
        }
        position = new Position(x, y);
        setPreferredSize(new Dimension(80, 80));
        setOpaque(true);
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

            }
        });
    }
}
