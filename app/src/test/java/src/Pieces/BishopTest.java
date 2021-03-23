package src.Pieces;

import org.junit.Test;

import static org.junit.Assert.*;

public class BishopTest {



    @Test
    public void bishopIsWhite_inputFalse_B() {
        int inicialPocionX = 6;
        int inicialPocionY = 0;
        Bishop bishop = new Bishop(false, inicialPocionX, inicialPocionY);
        char actual = bishop.getColor();
        char expected = 'B';
        assertEquals(expected, actual);
    }

    @Test
    public void bishopIsWhite_inputTrue_W() {
        int inicialPocionX = 4;
        int inicialPocionY = 5;
        Bishop bishop = new Bishop(true, inicialPocionX, inicialPocionY);
        char actual = bishop.getColor();
        char expected = 'W';
        assertEquals(expected, actual);
    }

    @Test
    public void getFigureKing_choseBishop_B() {
        int inicialPocionX = 7;
        int inicialPocionY = 0;
        Bishop bishop = new Bishop(true, inicialPocionX, inicialPocionY);
        char actual = bishop.getFigure();
        char expected = 'B';
        assertEquals(expected, actual);
    }
}