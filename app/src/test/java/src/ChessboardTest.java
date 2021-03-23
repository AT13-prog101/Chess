package src;

import org.junit.Test;
import src.Pieces.Piece;

import static org.junit.Assert.*;

public class ChessboardTest {
    @Test
    public void invalidMoveTest() {
        Chessboard chessboard = new Chessboard();
        Player playerWhite = new Player("Player1", true);
        Position source = new Position("d1");
        Position target = new Position("d2");
        boolean expected= false;
        boolean actual = chessboard.movePiece(source,target,playerWhite);
        assertEquals(expected, actual);
    }
}

