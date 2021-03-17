package src;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    @Test
    public void makeMoveGiven_Sa2_Ta3_return_a2_a3() {
        Player player = new Player("player1", "White");
        String move = "S(a2)T(a3)";
        String[] actual = {"a2","a3"};
        player.makeMove(move);
        String[] expected = player.getMove();
        assertEquals(expected, actual);
    }
    @Test
    public void makeMoveGiven_Sh5_Tf3_return_h5_f3() {
        Player player = new Player("player1", "White");
        String move = "S(h5)T(f3)";
        String[] actual = {"h5","f3"};
        player.makeMove(move);
        String[] expected = player.getMove();
        assertEquals(expected, actual);
    }
}
