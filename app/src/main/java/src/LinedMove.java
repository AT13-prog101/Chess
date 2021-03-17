package src;

public class LinedMove implements MovePiece{
    public final static int DIMENSION = 8;
    @Override
    public void move(int posX, int posY, boolean isWhite) {
        boolean killPiece=!isWhite;
        //Down
        for (int i = posX; i < DIMENSION; i++) {
            //board[i][posY] = "X";
        }
        //Up
        for (int i = 0; i < posX; i++) {
            //board[i][posY] = "X";
        }
        //right
        for (int i = posY; i < DIMENSION; i++) {
            //board[posX][i] = "X";
        }
        //Left
        for (int i = 0; i < posY; i++) {
            //board[posX][i] = "X";
        }
        //The piece doesn't occupy its position again
        //board[posX][posY] = "-";
    }
}
