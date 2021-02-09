package edu.wctc.review;

public class Lego extends Thing<Integer, String> {
    private int colorCode;

    public Lego(Integer id, String description, int colorCode) {
        super(id, description);
        this.colorCode = colorCode;
    }

    public String interactWithThing() {
        return "You pick up the lego piece.";
    }

    public int getColorCode() {
        return colorCode;
    }

    public void setColorCode(int colorCode) {
        this.colorCode = colorCode;
    }

    @Override
    public String toString() {
        return String.format("ID: %d\nDescription: %s", getValue(), getDescription());
    }
}
