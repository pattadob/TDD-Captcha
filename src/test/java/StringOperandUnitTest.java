import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by cadet on 8/24/2016 AD.
 */
public class StringOperandUnitTest {

    @Test
    public void stringShoudBeOne(){
        StringOperand stringOperand = new StringOperand(1);
        assertEquals("ONE", stringOperand.toString());
    }

    @Test
    public void stringShoudBeNINE(){
        StringOperand stringOperand = new StringOperand(9);
        assertEquals("NINE", stringOperand.toString());
    }
}
