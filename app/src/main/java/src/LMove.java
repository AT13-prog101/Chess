package src;

public class LMove implements MovePiece{

    @Override
    public void move(int posX, int posY, Piece piece) {
        if( isPossibleMove(piece.getInitPosX(), piece.getInitPosY(), posX, posY)) {
            piece.setInitPosX(posX);
            piece.setInitPosY(posY);
        }
    }

    public boolean isPossibleMove(int posInitX, int posInitY,int posEndX, int posEndY) {
        if(((Math.abs(posEndX-posInitX)==2) && (Math.abs(posEndY-posInitY)==1)||(Math.abs(posEndY-posInitY)==2 && Math.abs(posEndX-posInitX)==1)))
        {
            return true;
        }
        return false;
    }

    public boolean possibleMoves() {
        return false;
    }
}
