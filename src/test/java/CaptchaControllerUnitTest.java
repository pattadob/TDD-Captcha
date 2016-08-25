import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaptchaControllerUnitTest {

    @Test
    public void generateCaptchaShouldBeCalledOnce() {
        CaptchaController controller = new CaptchaController();
        CaptchaServiceInterface captchaService = new MyCaptchaService();
        controller.setCaptchaService(captchaService);
        controller.getCaptcha();

        assertEquals(1, ((MyCaptchaService)captchaService).getGenerateCaptchaCalled());
    }

    @Test
    public void resultShoudBeOnePlus1() {
        CaptchaController controller = new CaptchaController();
        MyCaptchaService captchaService = new MyCaptchaService();
        controller.setCaptchaService(captchaService);

        assertEquals("{\"left\": \"ONE\", \"operator\":\"+\", \"right\": \"1\"}", controller.getCaptcha());
    }

    private class MyCaptchaService implements CaptchaServiceInterface {

        private int generateCaptchaCalled = 0;

        public Captcha generateCaptcha() {
            generateCaptchaCalled++;
            return new Captcha(1, 1, 1, 1);
        }

        public int getGenerateCaptchaCalled() {
            return generateCaptchaCalled;
        }
    }
}
