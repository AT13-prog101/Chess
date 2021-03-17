package src;

public class SpecialMove implements MovePiece{

    @Override
    public void move(int posX, int posY, Piece piece) {

    }

    public boolean isValidMove() {
        return false;
    }

    public boolean isCastlingAvaible(Piece king, Piece tower) {
        return false;
    }
}
