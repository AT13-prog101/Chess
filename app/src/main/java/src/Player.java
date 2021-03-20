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
    public String getColor() {
        return color;
    }
}
