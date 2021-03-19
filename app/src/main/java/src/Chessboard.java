package src;

import src.Pieces.Piece;

public class Chessboard {
    public final static int DIMENSION = 8;
    public static Piece[][] board = new Piece[DIMENSION][DIMENSION];;
    private Team whiteTeam;
    private Team blackTeam;
    boolean turn;
    public Chessboard() {
        initializeChessboard();
    }
    public void initializeChessboard() {
        boolean isWhite = true;
        whiteTeam = new Team(isWhite);
        blackTeam = new Team(!isWhite);
    }
    /**
     * Prints the board in console
     */
    public void printBoard() {
        for (int row = 0; row < DIMENSION; row++) {
            System.out.print(DIMENSION - row + " | ");
            for (int col = 0; col < DIMENSION; col++) {
                if (board[row][col] != null) {
                    Piece piece = board[row][col];
                    String figure = String.valueOf(piece.getColor()) + String.valueOf(piece.getFigure()) + " ";
                    System.out.print(figure);
                } else {
                    System.out.print("  " + " ");
                }
            }
            System.out.println("");
        }
        System.out.println("   -----------------------");
        System.out.println("    a  b  c  d  e  f  g  h");
    }

    public void translatePosToMatrix() {

    }
    public boolean isCheckmate () {
        return false;
    }
    public void movePiece(String[] moveToMake, Player player) {
        PositionTraductor positionTraductor = new PositionTraductor();
        int sourceXpos = positionTraductor.getXIndexNotation(moveToMake[0]);
        int sourceYpos = positionTraductor.getYIndexNotation(moveToMake[0]);

        int targetXpos = positionTraductor.getXIndexNotation(moveToMake[1]);
        int targetYpos = positionTraductor.getYIndexNotation(moveToMake[1]);
        System.out.println(sourceXpos + " " + sourceYpos);
        System.out.println(targetXpos + " " + targetYpos);
        System.out.println(" ");
        Piece sourcePiece;
        if (Chessboard.board[sourceYpos][sourceXpos] != null) {
            sourcePiece = Chessboard.board[sourceYpos][sourceXpos];
            Chessboard.board[targetYpos][targetXpos] = Chessboard.board[sourceYpos][sourceXpos];
            Chessboard.board[sourceYpos][sourceXpos] = null;
        }
//        Piece targetPiece = Chessboard.board[targetYpos][targetXpos];
//        Chessboard.board[sourceYpos][sourceXpos] = targetPiece;
        printBoard();
    }
}
