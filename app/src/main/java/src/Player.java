package src;

import java.util.ArrayList;
import java.util.List;

public class Player {
    String name;
    boolean playerTurn;
    String color;
    Player(String name, String color){
        this.name = name;
        this.color = color;
    }
    public List<Position> makeMove(String movement){
        List<Position> moves = new ArrayList<Position>();
        if (movement.isEmpty()) {
            invalidMessage();
            makeMove(movement);
        }
        char[] inputArray= movement.toCharArray();
        if (movement.length() == 2) {
            Position position = new Position(movement);
            moves.add(position);
            return moves;
        } else {
            if (movement.length() == 5) {
                Position source = new Position(movement.substring(0,3));
                Position target = new Position(movement.substring(3));
                moves.add(source);
                moves.add(target);
                return moves;
            } else {
                return null;
            }
        }
    }
    public String getColor() {
        return color;
    }
    void invalidMessage(){
        System.out.println("The inserted info is not valid");
    }
}
