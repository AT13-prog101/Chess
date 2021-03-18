package src;

public class Chessboard {

    static final int DIMENSION = 8;
    public static String[][] board = {
            {"BR", "BH", "BB", "BQ", "WK", "BB", "BH", "BR"},
            {"BP", "BP", "BP", "BP", "BP", "BP", "BP", "BP"},
            {"  ", "..", "  ", "..", "  ", "..", "  ", ".."},
            {"..", "  ", "..", "  ", "..", "  ", "..", "  "},
            {"  ", "..", "  ", "..", "  ", "..", "  ", ".."},
            {"..", "  ", "..", "  ", "..", "  ", "..", "  "},
            {"WP", "WP", "WP", "WP", "WP", "WP", "WP", "WP"},
            {"WR", "WH", "WB", "WQ", "WK", "WB", "WH", "WR"}};
    public Chessboard() {
    }
    static void printBoard(){
        for (int i = 0; i<DIMENSION; i++){
            for (int j = 0; j<DIMENSION; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

}
