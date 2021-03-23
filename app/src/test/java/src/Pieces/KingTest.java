package src.Pieces;

import org.junit.Test;

import static org.junit.Assert.*;

public class KingTest {

    @Test
    public void kingIsWhite_inputTrue_W() {
        int inicialPocionX = 4;
        int inicialPocionY = 4;
        King king = new King(true, inicialPocionX, inicialPocionY);
        char actual = king.getColor();
        char expected = 'W';
        assertEquals(expected, actual);
    }

    @Test
    public void getFigureKing_choseKing_K() {
        int inicialPocionX = 4;
        int inicialPocionY = 4;
        King king = new King(true, inicialPocionX, inicialPocionY);
        char actual = king.getFigure();
        char expected = 'K';
        assertEquals(expected, actual);
    }
}