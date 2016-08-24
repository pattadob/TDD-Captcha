/**
 * Created by cadet on 8/24/2016 AD.
 */
public class Operator {
    private int operator;
    private String[] operatorArray = {"+","*","-"};
    public Operator(int operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return operatorArray[this.operator-1];
    }
}
