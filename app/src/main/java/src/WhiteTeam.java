package src;

import src.Pieces.Piece;

import java.util.ArrayList;
import java.util.Arrays;

public class WhiteTeam extends Team{
    /**
     * White pieces occupy rows 6 and 7 in the matrix
     *
     *                                                 MATRIX
     *      8| BR BH BB BQ BK BB BH BR      0| BR BH BB BQ BK BB BH BR
     *      7| BP BP BP BP BP BP BP BP      1| BP BP BP BP BP BP BP BP
     *      6|                              2|
     *      5|                              3|
     *      4|                          ==> 4|
     *      3|                              5|
     *      2| WP WP WP WP WP WP WP WP      6| WP WP WP WP WP WP WP WP
     *      1| WR WH WB WQ WK WB WH WR      7| WR WH WB WQ WK WB WH WR
     *        ------------------------         -----------------------
     *         a  b  c  d  e  f  g  h          0  1  2  3  4  5  6  7
     */
    int row6 = 6;
    int row7 = 7;
    private final char COLOR = 'w';
    ArrayList<String> piecesOrder = new ArrayList<String>(Arrays.asList(
                        "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn",
                        "Rook", "Horse", "Bishop", "Queen", "King", "Bishop", "Horse", "Rook"));
    /**
     * Add pieces with their initial positions to the Team of white pieces
     */
    public void initializeTeam() {
        GetPieceFactory getPieceFactory = new GetPieceFactory();
        int arrayPos = 0;
        for (int row = row6; row <= row7; row++) {
            for (int col = 0; col < Chessboard.DIMENSION; col++) {
                Piece piece = getPieceFactory.getPiece(piecesOrder.get(arrayPos), COLOR, col, row);
                super.setOfPieces.add(piece);
                arrayPos += 1;
            }
        }
    }
}
