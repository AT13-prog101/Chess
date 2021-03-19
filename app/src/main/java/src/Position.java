package src;

public class Position {
    private int posX;
    private int posY;
    private String charAlg;

    public Position(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    public Position(String charAlgebraic) {
        this.charAlg = charAlgebraic;
    }

    /**
     * Return Position X
     * @return posX
     */
    public int getPosX() {
        return this.posX;
    }

    /**
     * Return Position Y
     * @return posY
     */
    public int getPosY() {
        return this.posY;
    }

    /**
     * Return algebraic char
     * @return charAlg
     */
    public String getCharAlg() {
        return this.charAlg;
    }
}
