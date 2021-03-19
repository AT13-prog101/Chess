package src;

import org.junit.Test;
import src.Pieces.Piece;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    @Test
    public void makeMoveGiven_a2_a3_return_06_05() {
        GetPieceFactory getPieceFactory = new GetPieceFactory();
        Player player = new Player("player1", "White");
        
        String expected = "06 05";
        List<Position> act = player.makeMove("a2 a3");
        String actual = "" + act.get(0).getPosX() + "" + act.get(0).getPosY() + " " + act.get(1).getPosX() + "" + act.get(1).getPosY();
        assertEquals(expected, actual);
    }
}
