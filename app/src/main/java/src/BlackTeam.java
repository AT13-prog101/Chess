package src;

import src.Pieces.Piece;

import java.util.ArrayList;
import java.util.Arrays;

public class BlackTeam extends Team{
    /**
     * Black pieces occupy rows 0 and 1 in the matrix
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
    int row0 = 0;
    int row1 = 1;
    ArrayList<String> piecesOrder = new ArrayList<String>(Arrays.asList(
            "Rook", "Horse", "Bishop", "King", "Queen", "Bishop", "Horse", "Rook",
            "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn", "Pawn"));

    /**
     * Add pieces with their initial positions to the Team of black pieces
     */
    public void initializeTeam() {
        GetPieceFactory getPieceFactory = new GetPieceFactory();
        int arrayPos = 0;
        for (int row = row0; row <= row1; row++) {
            for (int col = 0; col < Chessboard.DIMENSION; col++) {
                Piece piece = getPieceFactory.getPiece(piecesOrder.get(arrayPos), false, col, row);
                setOfPieces.add(piece);
                arrayPos += 1;
            }
        }
    }
}
