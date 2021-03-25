package src.Pieces;

import org.junit.Test;
import src.Position;

import static org.junit.Assert.*;

public class QueenTest {
    @Test
    public void queenIsWhite_inputTrue_W() {
        int inicialPocionX = 5;
        int inicialPocionY = 6;
        Queen queen = new Queen(true, new Position(inicialPocionX, inicialPocionY));
        char actual = queen.getColor();
        char expected = 'W';
        assertEquals(expected, actual);
    }

    @Test
    public void getFigureQueen_ChoseQueen_Q() {
        int inicialPocionX = 4;
        int inicialPocionY = 3;
        Queen queen = new Queen(true, new Position(inicialPocionX, inicialPocionY));
        char actual = queen.getFigure();
        char expected = 'Q';
        assertEquals(expected, actual);
    }
}