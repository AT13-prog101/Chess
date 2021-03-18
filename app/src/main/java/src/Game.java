package src;

import java.util.Scanner;

public class Game {
    private int gameId;
    private Player player1;
    private Player player2;
    private Chessboard chessboard;
    private boolean turn = true; // true = white, false = black
    private boolean gameFinished = false;
    public Game(int id) {
        this.gameId = id;
        chessboard = new Chessboard();
        player1 = new Player("Player1", "White");
        player2 = new Player("Player2", "Black");
    }
    public void gameInit() {
        chessboard.printBoard();
        while(gameFinished == false) {
            doGameCycle();
        }
    }
    public void doGameCycle() {
        Scanner sc = new Scanner(System.in);
        if(!chessboard.isCheckmate()) {
            if(turn == true) {
                System.out.println("White turn .. Make a move:");
                String moveToMake = sc.nextLine();
                player1.makeMove(moveToMake);
                String[] move = player1.getMove();
                chessboard.movePiece(move, player1);
                turn = false;
            } else {
                System.out.println("Black turn .. Make a move:");
                String moveToMake = sc.nextLine();
                player1.makeMove(moveToMake);
                String[] move = player2.getMove();
                chessboard.movePiece(move, player2);
                turn = true;
            }
        }
    }
}
