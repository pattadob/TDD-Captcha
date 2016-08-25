import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaptchaControllerUnitTest {

    @Test
    public void generateCaptchaShouldBeCalledOnce(){
        CaptchaController controller = new CaptchaController();
        MyCaptchaService captchaService = new MyCaptchaService();
        captchaService.setRandomizer(new MyRandomizer());
        controller.setCaptchaService(captchaService);
        controller.getCaptcha();

        assertEquals(1, captchaService.getGenerateCaptchaCalled());
    }

    @Test
    public void resultShoudBeOnePlus1(){
        CaptchaController controller = new CaptchaController();
        MyCaptchaService captchaService = new MyCaptchaService();
        captchaService.setRandomizer(new MyRandomizer());
        controller.setCaptchaService(captchaService);

        assertEquals("{\"left\": \"ONE\", \"operator\":\"+\", \"right\": \"1\"}", controller.getCaptcha());
    }

    private class MyCaptchaService extends CaptchaService {

        private int generateCaptchaCalled = 0;

        @Override
        public Captcha generateCaptcha() {
            generateCaptchaCalled++;
            return super.generateCaptcha();
        }

        public int getGenerateCaptchaCalled() {
            return generateCaptchaCalled;
        }
    }

    private class MyRandomizer extends Randomizer {
        @Override
        public int getOperand() {
            return 1;
        }

        @Override
        public int getOperator() {
            return 1;
        }

        @Override
        public int getPattern() {
            return 1;
        }
    }
}
