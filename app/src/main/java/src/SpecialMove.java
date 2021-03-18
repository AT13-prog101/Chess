package src;

public class SpecialMove implements MovePiece{
    //Castling move
    @Override
    public void move(int posX, int posY, Piece piece) {

    }

    @Override
    public void possibleMoves(int[][] chessBoard, Piece king) {

    }

    public void castling(Piece king, Piece rook) {
        int posKing;
        int posRook;
        if(!king.isMoved() && !rook.isMoved()) {
           if (rook.getPosX() == 0) { //Queen Castling
               posKing = -2;
               posRook = 3;
           } else { //King Castling
               posKing = 2;
               posRook = -2;
           }
           if(!spaceBetweenUnderAttack() && spaceBetweenFree()) {
                king.setPosX(king.getPosX()+ posKing);
                rook.setPosX(rook.getPosX()+ posRook);
           }
        }
    }

    @Override
    public boolean isMoveValid(int xDest, int yDest) {
        return false;
    }

    public boolean spaceBetweenUnderAttack() {
        return false;
    }

    public  boolean spaceBetweenFree() {
        return true;
    }
}
