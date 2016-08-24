import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by cadet on 8/24/2016 AD.
 */
public class NumberOperandUnitTest {

    @Test
    public void numberShouldBe1(){
        NumberOperand numberOperand = new NumberOperand(1);
        assertEquals("1", numberOperand.toString());
    }
}
