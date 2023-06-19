package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier;
    private final Random random;

    public Lottery(ColorSupplier colorSupplier, Random random) {
        this.colorSupplier = colorSupplier;
        this.random = random;
    }

    public Ball getRandomBall() {
        return new Ball(getRandomColor(), getRandomNumber());
    }

    private Color getRandomColor() {
        return Color.valueOf(colorSupplier.getRandomColor());
    }

    private int getRandomNumber() {
        return random.nextInt(100) + 1;
    }
}
