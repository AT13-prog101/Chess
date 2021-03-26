package src.Utilities;

public class Player {
    private String name;
    private boolean isWhite;
    private String color;
    private String COLOR_WHITE = "White";
    private String COLOR_BLACK = "Black";

    public Player(String name, boolean isWhite) {
        this.name = name;
        this.isWhite = isWhite;
        if (isWhite) {
            this.color = COLOR_WHITE;
        } else {
            this.color = COLOR_BLACK;
        }
    }

    public boolean isWhite() {
        return isWhite;
    }

    public String getColor() {
        return color;
    }
}
