package src.Utilities;

import src.Views.ChessboardView;

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
    private Scanner sc;
    /**
     * Game represents a match between 2 players and controls the cycle of turns.
     * @param id of game.
     */
    public Game(final int id) {
        this.gameId = id;
        chessboard = new Chessboard();
        chessboard.initializeChessboard();
        playerWhite = new Player("Player1", PLAYER_WHITE);
        playerBlack = new Player("Player2", PLAYER_BLACK);
    }
    public void interfaceGame() {
        ChessboardView chessboardView = new ChessboardView(this);
        //chessboardView.initializeChessboard();
    }
    /**
     * Initializes the game logic.
     */
    public void gameInit() {
        chessboard.printBoard();
        while (!gameFinished) {
            if (chessboard.kingTakenBy() != null) {
                gameFinished = true;
                System.out.println("Game finished\nWinner: " + chessboard.kingTakenBy().getColor());
                break;
            }
            playerTurn(playerWhite);
            playerTurn(playerBlack);
        }
    }

    /**
     * Set player turn and player move.
     * @param player player turn.
     */
    public void playerTurn(final Player player) {
        boolean hasMoved = false;
        while (!hasMoved) {
            if (player.isWhite()) {
                System.out.println("White turn: make a Move");
            } else {
                System.out.println("Black turn: make a Move");
            }
                sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (input.equals("Restart")) {
                restartGame();
            }
            PositionValidator positionValidator = new PositionValidator(input);
            Position toGetpossibles = positionValidator.getPositionToGetPossibles();
            Position sourceMove = positionValidator.getSource();
            Position targetMove = positionValidator.getTarget();
            if (toGetpossibles != null && chessboard.thereIsPiece(toGetpossibles)) {
                chessboard.printValidMoves(chessboard.getValidMoves(toGetpossibles, player));
            } else {
                if (sourceMove != null && targetMove != null && chessboard.thereIsPiece(sourceMove)) {
                    boolean moved = chessboard.movePiece(sourceMove, targetMove, player);
                    if (moved) {
                        chessboard.printBoard();
                        hasMoved = true;
                    } else {
                        System.out.println("Invalid Input. Try again");
                    }
                } else {
                    System.out.println("Invalid Input. Try again");
                }
            }
        }
    }

    /**
     * Restart the game.
     */
    public void restartGame() {
        chessboard.resetChessBoard();
        chessboard = new Chessboard();
        playerWhite = new Player("Player1", PLAYER_WHITE);
        playerBlack = new Player("Player2", PLAYER_BLACK);
        gameInit();
    }
}
