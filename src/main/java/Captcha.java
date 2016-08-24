public class Captcha {

    private int left;
    private Operator operator;
    private int right;
    private int pattern;
    private String[] numberText = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};

    public Captcha(int pattern, int left, int operator, int right) {
        this.left = left;
        this.operator = new Operator(operator);
        this.right = right;
        this.pattern = pattern;
    }

    public String getLeft() {

        if (this.pattern == 1) {
            return numberText[this.left - 1];
        } else {
            return String.valueOf(this.left);
        }
    }

    public Operator getOperator(){
        return operator;
    }

    public String getRight() {
        if (this.pattern == 1) {
            return String.valueOf(right);
        } else {
            return numberText[this.right - 1];
        }
    }

    @Override
    public String toString() {
        return String.format("%s%s%s", getLeft(), getOperator(), getRight());
    }
}
