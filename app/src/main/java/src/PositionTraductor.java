package src;

public class PositionTraductor {
    private final int ASCII_CODE_FOR_A = 97;
    private final int ASCII_CODE_FOR_0 = 48;
    public PositionTraductor() {
    }

    /**
     * Given an Algebraic notation (Eg: a5, b6) where the 1st char represents the column position and
     * the 2nd char represents the row position. Returns the corresponding indexes int a matrix for those values
     * */
    public int[] getIndexNotation(String algebraicNotation) {
        int[] positions = new int[2];
        //Chars received represents the column and row, will be cast to int and  will be subtracted its value
        char characterCol = algebraicNotation.charAt(0);
        char characterRow = algebraicNotation.charAt(1);
        positions[0] = (int)characterCol - ASCII_CODE_FOR_A;
        positions[1] = (int)characterRow - ASCII_CODE_FOR_0 - 1;
        return positions;
    }

    /**
     * Given 2 values that represent the row and col positions in a matrix. Return the corresponding
     * algebraic notation for that position
     */
    public String getAlgebraicNotation(int rowIndex, int colIndex) {
        String algebraicNotation = String.valueOf(rowIndex + 1);
        algebraicNotation += (char)(colIndex + 97);
        return algebraicNotation;
    }
}
