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
    public List<String> makeMove(String movement){
        List<String> moves = new ArrayList<String>();
        if (movement.isEmpty()) {
            invalidMessage();
            makeMove(movement);
        }
        char[] inputArray= movement.toCharArray();
        String position = "";
        if (movement.length() == 2) {
            moves.add(position + inputArray[0] + inputArray[1]);
            return moves;
        } else {
            if (movement.length() == 5) {
                moves.add(position + inputArray[0] + inputArray[1]);
                moves.add(position + inputArray[3] + inputArray[4]);
            } else {
                return null;
            }
        }
        return null;
    }
    public String getColor() {
        return color;
    }
    void invalidMessage(){
        System.out.println("The inserted info is not valid");
    }
}
