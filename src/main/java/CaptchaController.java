/**
 * Created by cadet on 8/25/2016 AD.
 */
public class CaptchaController {

    private CaptchaServiceInterface captchaService;

    public void setCaptchaService(CaptchaServiceInterface captchaService) {
        this.captchaService = captchaService;
    }

    public String getCaptcha() {
        Captcha captcha = captchaService.generateCaptcha();
        String result = String.format("{\"left\": \"%s\", \"operator\":\"%s\", \"right\": \"%s\"}", captcha.getLeft(), captcha.getOperator(), captcha.getRight());

        return result;
    }
}
