package src;

import java.util.List;
import java.util.Scanner;

public class Game {
    private int gameId;
    private Player player1;
    private Player player2;
    private Chessboard chessboard;
    private boolean turn = true; // true = white, false = black
    private boolean gameFinished = false;
    private MoveController moveController = new MoveController();

    /**
     * Game represents a match between 2 players and controls the cycle of turns
     */
    public Game(int id) {
        this.gameId = id;
        chessboard = new Chessboard();
        player1 = new Player("Player1", "White");
        player2 = new Player("Player2", "Black");
    }

    /**
     * Initializes the game logic
     */
    public void gameInit() {
        chessboard.printBoard();
        while(gameFinished == false) {
            doGameCycle();
        }
    }

    /**
     * Iterates the turns
     */
    public void doGameCycle() {
        Scanner sc = new Scanner(System.in);
        if(!chessboard.isCheckmate()) {
            if(turn == true) {
                Position sourcePosition = inputSourceWhite(sc);
                printValidMoves(moveController.getValidMoves(sourcePosition, player1));
                Position targetPosition = inputTargetWhite(sc);
                moveController.makeAMove(targetPosition, player1);
                chessboard.printBoard();
                turn = false;
            } else {
                Position sourcePosition = inputSourceBlack(sc);
                printValidMoves(moveController.getValidMoves(sourcePosition, player2));
                Position targetPosition = inputTargetBlack(sc);
                moveController.makeAMove(targetPosition, player2);
                chessboard.printBoard();
                turn = true;
            }
        }
    }
    public void printValidMoves(List<Position> validMoves) {
        for (Position pos : validMoves) {
            System.out.println(pos.getCharAlg() + " ");
        }
    }
    public Position inputSourceBlack(Scanner sc) {
        System.out.println("Black turn: Introduce Source position");
        Position pos = new Position(sc.nextLine());
        return pos;
    }
    public Position inputTargetBlack(Scanner sc) {
        System.out.println("Black turn: Introduce Target position:");
        Position pos = new Position(sc.nextLine());
        return pos;
    }
    public Position inputSourceWhite(Scanner sc) {
        System.out.println("White turn: Introduce Source position");
        Position pos = new Position(sc.nextLine());
        return pos;
    }
    public Position inputTargetWhite(Scanner sc) {
        System.out.println("White turn: Introduce Target position");
        Position pos = new Position(sc.nextLine());
        return pos;
    }
}
