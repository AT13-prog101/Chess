package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    String name;
    boolean playerTurn;
    String color;
    Player (String name, String color){
        this.name = name;
        this.color = color;
    }
    void makeMove(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Insert the movement:");
        String movement =scan.next();
        if (movement.isEmpty()) {
            invalidMessage();
            makeMove();
        }
        char[] inputArray= movement.toCharArray();
        validateInput(inputArray);

    }

    void validateInput(char[] playerInput){

        if (playerInput[0] =='S'){
            char[] source = new char[]{playerInput[2],playerInput[3]};
            char[] target = new char[]{playerInput[7],playerInput[8]};
            sourceToTargetMovement(source,target);
        }else {
            char[] piece = new char[]{playerInput[2],playerInput[3]};
            possibleMovements(piece);
        }
    }
    void invalidMessage(){
        System.out.println("The inserted info is not valid");
    }
    void sourceToTargetMovement(char[] source,char[] target){

    }
    void possibleMovements(char[] piece){


    }
}

