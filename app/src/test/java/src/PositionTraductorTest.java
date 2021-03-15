package src;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PositionTraductorTest {
    @Test
    public void getIndexNotationGivenA1Return00() {
        PositionTraductor positionTraductor = new PositionTraductor();
        String expected = "00";
        int[] indexNotation = positionTraductor.getIndexNotation("a1");
        String actual = String.valueOf(indexNotation[0]) + String.valueOf(indexNotation[1]);
        assertEquals(expected, actual);
    }
    @Test
    public void getIndexNotationGivenC5Return24() {
        PositionTraductor positionTraductor = new PositionTraductor();
        String expected = "24";
        int[] indexNotation = positionTraductor.getIndexNotation("c5");
        String actual = String.valueOf(indexNotation[0]) + String.valueOf(indexNotation[1]);
        assertEquals(expected, actual);
    }
    @Test
    public void getIndexNotationGivenH8Return77() {
        PositionTraductor positionTraductor = new PositionTraductor();
        String expected = "77";
        int[] indexNotation = positionTraductor.getIndexNotation("h8");
        String actual = String.valueOf(indexNotation[0]) + String.valueOf(indexNotation[1]);
        assertEquals(expected, actual);
    }
}
