import java.util.Arrays;

/**
 * Created by cadet on 8/24/2016 AD.
 */
public class StringOperand extends Operand{
    private String[] numberText = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
    private int index;

    public StringOperand(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return numberText[this.index - 1];
    }
}
