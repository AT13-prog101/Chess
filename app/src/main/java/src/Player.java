package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    String name;
    String color;
    String[] move = new String[2];;
    Player(String name, String color){
        this.name = name;
        this.color = color;
    }
    void makeMove(String movement){
        if (movement.isEmpty()) {
            invalidMessage();
            makeMove(movement);
        }
        char[] inputArray= movement.toCharArray();
        String position = "";
        move[0] = position + inputArray[2] + inputArray[3];
        move[1] = position + inputArray[7] + inputArray[8];
    }
    public String[] getMove() {
        return move;
    }
    void invalidMessage(){
        System.out.println("The inserted info is not valid");
    }
}
