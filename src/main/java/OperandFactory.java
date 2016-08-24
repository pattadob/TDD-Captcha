/**
 * Created by cadet on 8/24/2016 AD.
 */
public class OperandFactory {

    public static Operand getOperand(int pattern, int value, Side side){
        Operand operand;
        if (pattern == 1){
            return side == Side.LEFT ? new StringOperand(value) : new NumberOperand(value);
        } else {
            return side == Side.RIGHT ? new StringOperand(value) : new NumberOperand(value);
        }
    }
}
