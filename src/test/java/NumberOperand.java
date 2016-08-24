public class NumberOperand {
    private int number;

    public NumberOperand(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.valueOf(this.number);
    }
}
