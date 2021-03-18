package src;

public class SpecialMove implements MovePiece{
    //Castling move
    public void move(int posX, int posY, Piece piece) {

    }



    public void castling(Piece king, Piece rook) {
        int posKing;
        int posRook;
        if(!king.isMoved() && !rook.isMoved()) {
            if (rook.getInitPosX() == 0) { //Queen Castling
                posKing = -2;
                posRook = 3;
            } else { //King Castling
                posKing = 2;
                posRook = -2;
            }
            if(!spaceBetweenUnderAttack() && spaceBetweenFree()) {
                king.setPosX(king.getInitPosX()+ posKing);
                rook.setPosX(rook.getInitPosX()+ posRook);
            }
        }
    }

    public boolean spaceBetweenUnderAttack() {
        return false;
    }

    public  boolean spaceBetweenFree() {
        return true;
    }
}