package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    String name;
    MoveValidator moveValidator;
    String color;
    Player (String name, String color){
        this.name = name;
        this.color = color;
        moveValidator = new MoveValidator();
    }
    void makeMove(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Insert the movement:");
        String movement =scan.next();
        char[] inputArray= movement.toCharArray();
        int sourceRow = Character.getNumericValue(inputArray[2]);
        int sourceCol=Character.getNumericValue(inputArray[3]);
        int targetRow= Character.getNumericValue(inputArray[7]);
        int targetCol=Character.getNumericValue(inputArray[8]);
        sourceToTargetMovement( sourceRow, sourceCol,targetRow, targetCol);
    }

//    void validateInput(char[] playerInput){
//
//        if (playerInput[0] =='S'){
//            char[] source = new char[]{playerInput[2],playerInput[3]};
//            char[] target = new char[]{playerInput[7],playerInput[8]};
//            sourceToTargetMovement(source,target);
//        }else {
//            char[] piece = new char[]{playerInput[2],playerInput[3]};
//            possibleMovements(piece);
//        }
//    }
//    void invalidMessage(){
//        System.out.println("The inserted info is not valid");
//    }
    void sourceToTargetMovement(int rowSource, int colSource,int rowTarget,int colTarget){
       String piece = Chessboard.board [rowSource][colSource];
       Chessboard.board [rowSource][colSource] ="  ";
       Chessboard.board [rowTarget][colTarget] =piece;
       Chessboard.printBoard();
    }
//    void possibleMovements(char[] piece){
//    }
}

