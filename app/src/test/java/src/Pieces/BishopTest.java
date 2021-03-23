package src.Pieces;

import org.junit.Test;

import static org.junit.Assert.*;

public class BishopTest {

    @Test
    public void getFigureKing_choseKing_B() {
        int inicialPocionX = 7;
        int inicialPocionY = 0;
        Bishop bishop = new Bishop(true, inicialPocionX, inicialPocionY);
        char actual = bishop.getFigure();
        char expected = 'B';
        assertEquals(expected, actual);
    }
}