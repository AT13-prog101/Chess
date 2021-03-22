package src;

import java.util.ArrayList;
import java.util.List;

public class Player {
    String name;
    boolean isWhite;
    boolean playerTurn;
    String color;
    Player(String name, boolean isWhite){
        this.name = name;
        this.isWhite = isWhite;
    }
    public boolean isWhite() {
        return isWhite;
    }
    public String getName() {
        return name;
    }
}
