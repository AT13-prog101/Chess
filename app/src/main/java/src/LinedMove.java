package src;

public class LinedMove implements MovePiece{

    @Override
    public void move(int posX, int posY, boolean isWhite) {
        int dimension = 8;
        boolean killPiece=!isWhite;
        //Down
        for (int i = posX; i < dimension; i++) {
            //board[i][posY] = "X";
        }
        //Up
        for (int i = 0; i < posX; i++) {
            //board[i][posY] = "X";
        }
        //right
        for (int i = posY; i < dimension; i++) {
            //board[posX][i] = "X";
        }
        //Left
        for (int i = 0; i < posY; i++) {
            //board[posX][i] = "X";
        }
        //The piece doesn't occupy its position again
        //board[posX][posY] = " ";
    }
}
