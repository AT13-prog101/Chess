package src.Utilities;

import java.util.Objects;

public class Position {
    private int posX;
    private int posY;
    private String charAlg;

    public Position(int posX, int posY) {
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
     *
     * @return posX
     */
    public int getPosX() {
        return this.posX;
    }

    /**
     * Return Position Y
     *
     * @return posY
     */
    public int getPosY() {
        return this.posY;
    }

    /**
     * Return algebraic char
     *
     * @return charAlg
     */
    public String getCharAlg() {
        return this.charAlg;
    }

    @Override
    public boolean equals(Object o) {
        Position position = (Position) o;
        return posX == position.posX && posY == position.posY && Objects.equals(charAlg, position.charAlg);
    }


}
