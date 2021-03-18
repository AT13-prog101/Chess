package src;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetPieceFactoryTest {
    @Test
    public void getPawnFigurefromGetfactory() {
        GetPieceFactory getPieceFactory = new GetPieceFactory();
        String name = "Pawn";
        Piece pawn = getPieceFactory.getPiece(name, true, 0, 0);
        char expected = 'P';
        char actual = pawn.getFigure();
        assertEquals(expected, actual);
    }
    @Test
    public void getQueenFigurefromGetfactory() {
        GetPieceFactory getPieceFactory = new GetPieceFactory();
        String name = "Queen";
        Piece queen = getPieceFactory.getPiece(name, true, 6, 5);
        char expected = 'Q';
        char actual = queen.getFigure();
        assertEquals(expected, actual);
    }
    @Test
    public void getPositionXFromPiecefromGetfactory() {
        GetPieceFactory getPieceFactory = new GetPieceFactory();
        String name = "Pawn";
        Piece pawn = getPieceFactory.getPiece(name, true, 7, 7);
        int expected = 7;
        int actual = pawn.getInitPosX();
        assertEquals(expected, actual);
    }
}
