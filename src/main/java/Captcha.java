public class Captcha {

    private Operand leftOperand;
    private Operator operator;
    private Operand rightOperand;
    private int pattern;
    private String[] numberText = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};

    public Captcha(int pattern, int left, int operator, int right) {
        this.leftOperand = OperandFactory.getOperand(pattern, left, Side.LEFT);
        this.rightOperand = OperandFactory.getOperand(pattern, right, Side.RIGHT);
        this.operator = new Operator(operator);
        this.pattern = pattern;
    }

    public Operand getLeft() {
        return this.leftOperand;
    }

    public Operator getOperator() {
        return operator;
    }

    public Operand getRight() {
        return this.rightOperand;
    }

    @Override
    public String toString() {
        return String.format("%s%s%s", getLeft(), getOperator(), getRight());
    }
}
