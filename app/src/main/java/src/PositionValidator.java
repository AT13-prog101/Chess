package src;

import src.Pieces.Piece;

import java.lang.annotation.Target;
import java.nio.file.LinkPermission;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class PositionValidator {

    private Position source;
    private Position target;
    private Position positionToGetPossibles;
    private String input;
    private int SIZE_POSITION_INPUT = 2;
    private int SIZE_MOVE_INPUT = 5;

    /**
     * Move Validator returns the positions for a given input if they are valid
     */
    public PositionValidator(String input) {
        this.input = input;
        validateInput();
    }

    /**
     * Process a string to know if they contain one or two Positions and store them if valid
     */
    public void validateInput() {
        isActionGetPossibleMoves();
        isActionMovePiece();
    }
    /**
     * Stores the position if it one to get possible moves from
     */
    public void isActionGetPossibleMoves() {
        if (input.length() == SIZE_POSITION_INPUT) {
            if (isPositionValid()) {
                this.positionToGetPossibles= new Position(input);
            }
        }
    }
    /**
     * Stores the source and target position if the inputs contains two valid positions
     */
    public void isActionMovePiece() {
        if (input.length() == SIZE_MOVE_INPUT) {
            String source = input.substring(0,2);
            String target = input.substring(3);
            if (isMoveValid()) {
                this.source = new Position(source);
                this.target = new Position(target);
            }
        }
    }

    /**
     * Checks if the input matches a position format
     */
    public boolean isPositionValid() {
        return Pattern.matches("[a-h][1-8]", input);
    }

    /**
     * Checks if the input matches two positions with valid format
     */
    public boolean isMoveValid() {
        return Pattern.matches("[a-h][1-8][ ][a-h][1-8]", input);
    }

    /**
     * @return getPositionToGetPossibles
     */
    public Position getPositionToGetPossibles() {
        return this.positionToGetPossibles;
    }
    /**
     * @return getSource
     */
    public Position getSource() {
        return source;
    }
    /**
     * @return getTarget
     */
    public Position getTarget() {
        return target;
    }
}
