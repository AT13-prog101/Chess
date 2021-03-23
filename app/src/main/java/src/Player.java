package src;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private boolean isWhite;
    private boolean playerTurn;
    private String color;
    private String COLOR_WHITE = "White";
    private String COLOR_BLACK = "Black";
    Player(String name, boolean isWhite){
        this.name = name;
        this.isWhite = isWhite;
        if(isWhite) {
            this.color = COLOR_WHITE;
        } else {
            this.color = COLOR_BLACK;
        }
    }
    public boolean isWhite() {
        return isWhite;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
}
