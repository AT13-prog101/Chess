package src;

public class Chessboard {
    public final int ASCI_CODE_A = 97;
    private final int DIMENSION = 8;
    private String[][] board = new String[DIMENSION][DIMENSION];
    boolean turn;
    public Chessboard() {

    }
    public void fillBoard() {
        for (int i = DIMENSION - 1; i >= 0; i--) {
            int asciiCode = ASCI_CODE_A;
            for (int j = DIMENSION - 1; j >=0; j--) {
                char colPos = (char)asciiCode;
                board[i][j] = String.valueOf(DIMENSION - i) + colPos;
                asciiCode += 1;
            }
            asciiCode = ASCI_CODE_A;
        }
    }
    public String[][] getBoard() {
        return board;
    }
}
