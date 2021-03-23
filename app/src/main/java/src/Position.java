package src;

public class Position {
    private int posX;
    private int posY;
    private String charAlg;

    public Position(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
        this.charAlg = PositionTraductor.getAlgebraicNotation(posX, posY);
    }

    public Position(String charAlgebraic) {
        this.charAlg = charAlgebraic;
        this.posX = PositionTraductor.getXIndexNotation(charAlgebraic);
        this.posY = PositionTraductor.getYIndexNotation(charAlgebraic);
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

    /**
     * Returns the value of the column in the algebraic format
     */
    public String getAlgCol() {
        return charAlg.substring(0,1);
    }
    /**
     * Returns the value of the column in the algebraic format
     */
    public String getAlgRow() {
        return charAlg.substring(1);
    }
}
