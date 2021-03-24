package src.Pieces;

import org.junit.Test;
import src.Position;

import static org.junit.Assert.*;

public class RookTest {
    @Test
    public void rookIsBlack_inputFalse_B() {
        int inicialPocionX = 8;
        int inicialPocionY = 2;
        Rook rook = new Rook(true, new Position(inicialPocionX, inicialPocionY));
        char actual = rook.getColor();
        char expected = 'W';
        assertEquals(expected, actual);
    }

    @Test
    public void rookIsWhite_inputTrue_W() {
        int inicialPocionX = 8;
        int inicialPocionY = 2;
        Rook rook = new Rook(true, new Position(inicialPocionX, inicialPocionY));
        char actual = rook.getColor();
        char expected = 'W';
        assertEquals(expected, actual);
    }

    @Test
    public void getFigureRook_choseRook_R() {
        int inicialPocionX = 7;
        int inicialPocionY = 6;
        Rook rook = new Rook(true, new Position(inicialPocionX, inicialPocionY));
        char actual = rook.getFigure();
        char expected = 'R';
        assertEquals(expected, actual);
    }
}