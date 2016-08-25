import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class CaptchaUnitTest {
    public static final int DUMMY_OPERATOR = 1;
    public static final int DUMMY_RIGHT = 1;
    public static final int DUMMY_LEFT = 1;
    public static final int DUMMY_PATTERN = 1;

    @Test
    public void operandLeftShouldBeInstanceOfStringOperand(){
        Captcha captcha = new Captcha(1, DUMMY_LEFT, DUMMY_OPERATOR, DUMMY_RIGHT);
        assertTrue(captcha.getLeft() instanceof StringOperand);
    }

    @Test
    public void operandLeftShouldBeInstanceOfNumberOperand(){
        Captcha captcha = new Captcha(2, DUMMY_LEFT, DUMMY_OPERATOR, DUMMY_RIGHT);
        assertTrue(captcha.getLeft() instanceof NumberOperand);
    }


    @Test
    public void operatorShouldBeInstanceOfOperator(){
        Captcha captcha = new Captcha(DUMMY_PATTERN, DUMMY_LEFT, 1, DUMMY_RIGHT);
        assertTrue(captcha.getOperator()instanceof Operator);
    }

    @Test
    public void operandRightShouldBeInstanceOfStringOperand(){
        Captcha captcha = new Captcha(2, DUMMY_LEFT, DUMMY_OPERATOR, DUMMY_RIGHT);
        assertTrue(captcha.getRight() instanceof StringOperand);
    }

    @Test
    public void operandRightShouldBeInstanceOfNumberOperand(){
        Captcha captcha = new Captcha(1, DUMMY_LEFT, DUMMY_OPERATOR, DUMMY_RIGHT);
        assertTrue(captcha.getRight() instanceof NumberOperand);
    }

    @Test
    public void captchaShouldBeONEPlus1() {
        Captcha captcha = new Captcha(1, 1, 1, 1);
        assertEquals("ONE+1", captcha.toString());
    }

    @Test
    public void captchaShouldBeNINEMinus9() {
        Captcha captcha = new Captcha(1, 9, 3, 9);
        assertEquals("NINE-9", captcha.toString());
    }

}
