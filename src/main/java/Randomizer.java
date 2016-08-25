
import java.util.Random;

public class Randomizer {

    public Random random;

    public void setRandom(Random random) {
        this.random = random;
    }

    public int getPattern() {
        return random.nextInt(2);
    }

    public int getOperator() {
        return random.nextInt(3);
    }

    public int getOperand() {
        return random.nextInt(9);
    }
}


