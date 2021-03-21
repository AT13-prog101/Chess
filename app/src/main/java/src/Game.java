package src;

import java.security.spec.ECField;
import java.util.List;
import java.util.Scanner;

public class Game {
    private int gameId;
    private Player playerWhite;
    private Player playerBlack;
    private Chessboard chessboard;
    private boolean turn = true; // true = white, false = black
    private final boolean PLAYER_WHITE = true;
    private final boolean PLAYER_BLACK = false;
    private boolean gameFinished = false;
    private MoveController moveController = new MoveController();
    Scanner sc;
    /**
     * Game represents a match between 2 players and controls the cycle of turns
     */
    public Game(int id) {
        this.gameId = id;
        chessboard = new Chessboard();
        playerWhite = new Player("Player1", PLAYER_WHITE);
        playerBlack = new Player("Player2", PLAYER_BLACK);
    }

    /**
     * Initializes the game logic
     */
    public void gameInit() {
        chessboard.printBoard();
        sc = new Scanner(System.in);
        while(gameFinished == false) {
            doGameCycle();
        }
    }

    /**
     * Iterates the turns
     */
    public void doGameCycle() {
        if(!chessboard.isCheckmate()) {
            if(turn == true) {
                try {
                    Position sourcePosition = inputSourceWhite(sc);
                    printValidMoves(moveController.getValidMoves(sourcePosition, playerWhite));
                    Position targetPosition = inputTargetWhite(sc);
                    moveController.makeAMove(targetPosition, playerWhite);
                    this.turn = false;
                    chessboard.printBoard();
                } catch (Exception e) {
                    System.out.println("Wrong input");
                }
            } else {
                try {
                    Position sourcePosition = inputSourceBlack(sc);
                    printValidMoves(moveController.getValidMoves(sourcePosition, playerBlack));
                    Position targetPosition = inputTargetBlack(sc);
                    moveController.makeAMove(targetPosition, playerBlack);
                    this.turn = true;
                    chessboard.printBoard();
                } catch (Exception e) {
                    System.out.println("Wrong input");
                }
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
