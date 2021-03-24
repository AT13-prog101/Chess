package src.Pieces;

import org.junit.Test;
import src.Position;

import static org.junit.Assert.*;

public class RookTest {

    @Test
    public void getFigureRook_choseRook_R() {
        int inicialPocionX = 7;
        int inicialPocionY = 0;
        Rook rook = new Rook(true, new Position(inicialPocionX, inicialPocionY));
        char actual = rook.getFigure();
        char expected = 'R';
        assertEquals(expected, actual);
    }
}