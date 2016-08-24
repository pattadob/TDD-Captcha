import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by khan on 8/24/2016 AD.
 */
public class CaptchaUnitTest {
    public static final int DUMMY_OPERATOR = 1;
    public static final int DUMMY_RIGHT = 1;
    public static final int DUMMY_LEFT = 1;
    public static final int DUMMY_PATTERN = 1;

    @Test
    public void leftShouldBeONE() {
        Captcha captcha = new Captcha(1, 1, DUMMY_OPERATOR, DUMMY_RIGHT);
        assertEquals("ONE", captcha.getLeft());
    }

    @Test
    public void leftShouldBeNINE() {
        Captcha captcha = new Captcha(1, 9, DUMMY_OPERATOR, DUMMY_RIGHT);
        assertEquals("NINE", captcha.getLeft());
    }

    @Test
    public void leftShouldBeFIVE() {
        Captcha captcha = new Captcha(1, 5, DUMMY_OPERATOR, DUMMY_RIGHT);
        assertEquals("FIVE", captcha.getLeft());
    }

    @Test
    public void operatorShouldBePlus() {
        Captcha captcha = new Captcha(DUMMY_PATTERN, DUMMY_LEFT, 1, DUMMY_RIGHT);
        assertEquals("+", captcha.getOperator());
    }

    @Test
    public void operatorShouldBeMultiply() {
        Captcha captcha = new Captcha(DUMMY_PATTERN, DUMMY_LEFT, 2, DUMMY_RIGHT);
        assertEquals("x", captcha.getOperator());
    }

    @Test
    public void operatorShouldBeMinus() {
        Captcha captcha = new Captcha(DUMMY_PATTERN, DUMMY_LEFT, 3, DUMMY_RIGHT);
        assertEquals("-", captcha.getOperator());
    }

    @Test
    public void rightShouldBe1() {
        Captcha captcha = new Captcha(1, DUMMY_LEFT, DUMMY_OPERATOR, 1);
        assertEquals("1", captcha.getRight());
    }

    @Test
    public void rightShouldBe9(){
        Captcha captcha = new Captcha(1, DUMMY_LEFT, DUMMY_OPERATOR, 9);
        assertEquals("9", captcha.getRight());
    }

    @Test
    public void rightShouldBe5(){
        Captcha captcha = new Captcha(1, DUMMY_LEFT, DUMMY_OPERATOR, 5);
        assertEquals("5", captcha.getRight());
    }

    @Test
    public void leftShouldBe1() {
        Captcha captcha = new Captcha(2, 1, DUMMY_OPERATOR, DUMMY_RIGHT);
        assertEquals("1", captcha.getLeft());
    }

    @Test
    public void leftShouldBe9() {
        Captcha captcha = new Captcha(2, 9, DUMMY_OPERATOR, DUMMY_RIGHT);
        assertEquals("9", captcha.getLeft());
    }

    @Test
    public void leftShouldBe7() {
        Captcha captcha = new Captcha(2, 7, DUMMY_OPERATOR, DUMMY_RIGHT);
        assertEquals("7", captcha.getLeft());
    }

    @Test
    public void rightShouldBeONE(){
        Captcha captcha = new Captcha(2,DUMMY_LEFT,DUMMY_OPERATOR,1);
        assertEquals("ONE",captcha.getRight());
    }

    @Test
    public void rightShouldBeNINE(){
        Captcha captcha = new Captcha(2,DUMMY_LEFT, DUMMY_OPERATOR, 9);
        assertEquals("NINE", captcha.getRight());
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
