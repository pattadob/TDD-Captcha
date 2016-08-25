import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class OperatorUnitTest {

    @Test
    public void operatorShouldBePlus() {
        Operator operator = new Operator(1);
        assertEquals("+", operator.toString());
    }

    @Test
    public void operatorShouldBeMultiple(){
        Operator operator = new Operator(2);
        assertEquals("*", operator.toString());
    }

    @Test
    public void operatorShouldBeMinus(){
        Operator operator = new Operator(3);
        assertEquals("-", operator.toString());
    }
}
