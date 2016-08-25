import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CaptchaServiceUnitTest {

    @Test
    public void shouldReturnCaptcha() {
        CaptchaService captchaService = new CaptchaService();
        MyRandomizer myRandomizer = new MyRandomizer();
        captchaService.setRandomizer(myRandomizer);
        assertEquals("ONE+1", captchaService.generateCaptcha().toString());
        assertEquals(1, myRandomizer.callPattern);
        assertEquals(1, myRandomizer.callOperator);
        assertEquals(2, myRandomizer.callOperand);
    }

    public class MyRandomizer extends Randomizer {
        public int callPattern = 0;
        public int callOperator = 0;
        public int callOperand = 0;

        @Override
        public int getPattern() {
            callPattern++;
            return 1;
        }

        @Override
        public int getOperator() {
            callOperator++;
            return 1;
        }

        @Override
        public int getOperand() {
            callOperand++;
            return 1;
        }
    }
}
