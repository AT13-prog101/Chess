package src;

public interface MovePiece {
    void move(int posX,int posY, Piece piece);

    /**
     * Method that return an array[][] of all the possible
     * moves of Knight in a determinate position.
     *
     * @param chessBoard dimension of Board.
     * @param piece Knight piece
     * @return
     */
    void possibleMoves(int[][] chessBoard, Piece piece);

    /**
     *
     * @param xDest X Destination position
     * @param yDest Y Destination position
     * @return if that destination position is valid for Knight.
     */
    boolean isMoveValid(int xDest, int yDest);
}
