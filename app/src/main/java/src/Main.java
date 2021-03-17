package src;

import org.checkerframework.checker.units.qual.C;

public class Main {
    public static void main(String[] args) {
        //Game game = new Game(1);
        Chessboard chessboard = new Chessboard();
        System.out.println(chessboard.getPieceValidMoves("c7"));
    }
}
