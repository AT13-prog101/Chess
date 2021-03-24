package src;

import src.Pieces.Piece;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Team {
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
    int row6 = 6;
    int row7 = 7;
    List<TypePiece> whitePiecesOrder = new ArrayList<TypePiece>(Arrays.asList(
           TypePiece.PAWN, TypePiece.PAWN, TypePiece.PAWN, TypePiece.PAWN, TypePiece.PAWN, TypePiece.PAWN, TypePiece.PAWN, TypePiece.PAWN,
            TypePiece.ROOK, TypePiece.HORSE, TypePiece.BISHOP, TypePiece.QUEEN, TypePiece.KING, TypePiece.BISHOP, TypePiece.HORSE, TypePiece.ROOK));
    ArrayList<TypePiece> blackPiecesOrder = new ArrayList<TypePiece>(Arrays.asList(
            TypePiece.ROOK, TypePiece.HORSE, TypePiece.BISHOP, TypePiece.KING,TypePiece.QUEEN , TypePiece.BISHOP, TypePiece.HORSE, TypePiece.ROOK,
            TypePiece.PAWN, TypePiece.PAWN, TypePiece.PAWN, TypePiece.PAWN, TypePiece.PAWN, TypePiece.PAWN, TypePiece.PAWN, TypePiece.PAWN));
    /**
     * Class Team stores a set of pieces
     */
    public Team(boolean isWhite) {
        if (isWhite) {
            initializeTeam(row6, row7, whitePiecesOrder, isWhite);
        } else {
            initializeTeam(row0, row1, blackPiecesOrder, isWhite);
        }
    }
    /**
     * Fills the set of pieces of the team with Pieces
     */

    public void initializeTeam(int rowSup, int rowInf, List<TypePiece> piecesOrder, boolean isWhite) {
        PieceFactory pieceFactory = new PieceFactory();
        int arrayPos = 0;
        for (int row = rowSup; row <= rowInf; row++) {
            for (int col = 0; col < Chessboard.DIMENSION; col++) {
                Piece piece = pieceFactory.getPiece(piecesOrder.get(arrayPos), isWhite, col, row);
                Chessboard.board[row][col].setPiece(piece);
                arrayPos += 1;
            }
        }
    }
}
