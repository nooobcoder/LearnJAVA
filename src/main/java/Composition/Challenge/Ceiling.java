package main.java.Composition.Challenge;

public class Ceiling {
    private int height,paintedColour;

    public Ceiling(int height, int paintedColour) {
        this.height = height;
        this.paintedColour = paintedColour;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColour() {
        return paintedColour;
    }
}
