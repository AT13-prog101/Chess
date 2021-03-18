package src;

public class DiagonalsMove implements MovePiece{
    @Override
    public void move(int posX, int posY, boolean isWhite) {
        int dimension = 8;
        int numerMax=Math.max(posX,posY);
        int numerMin=Math.min(posX,posY);
        //cuadrante IV, (I)
        for (int i = 1; numerMax + i < dimension; i++) {
            //board[posX + i][posY + i] = "X";
        }
        //cuadrante II (III)
        for (int i = 1; numerMin - i >=0; i++) {
            //board[posX - i][posY - i] = "X";
        }

        //cuadrante III (IV)
        for (int i = 1; posX + i < dimension && posY - i >= 0; i++) {
            //board[posX + i][posY - i] = "X";
        }

        //cuadrante I (II)
        for (int i = 1; posY + i < dimension && posX - i >= 0; i++) {
            //board[posX -i][posY + i] = "X";
        }
        //The piece doesn't occupy its position again
        //board[posX][posY] = " ";
    }
}
