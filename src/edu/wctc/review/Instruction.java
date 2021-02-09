package edu.wctc.review;

import java.util.HashMap;
import java.util.Map;

public class Instruction extends Thing<Integer, String> {
    private Lego lego;
    private int colorCode;
    private Map<Integer, String> colorMap;

    public Instruction(Lego lego, int colorCode, int quantity, String instruction) {
        super(quantity, instruction);
        this.lego = lego;
        this.colorCode = colorCode;

        colorMap = new HashMap<>();
        colorMap.put(1, "Blue");
        colorMap.put(2, "Green");
        colorMap.put(3, "Brown");
    }

    public String interactWithThing() {
        return String.format("You pick up the %d lego %s and follow the instructions",
                getValue(), getValue() > 1 ? "pieces" : "piece");
    }

    public Lego getLego() {
        return lego;
    }

    public void setLego(Lego lego) {
        this.lego = lego;
    }

    public int getColorCode() {
        return colorCode;
    }

    public void setColorCode(int colorCode) {
        this.colorCode = colorCode;
    }

    public String getColor() {
        return colorMap.get(colorCode);
    }

    @Override
    public String toString() {
        return String.format("Item: %s %s\nQuantity: %d\nInstructions: %s",
                getColor(), lego.getDescription(), getValue(), getDescription());
    }
}
