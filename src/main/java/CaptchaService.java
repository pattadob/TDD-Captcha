
public class CaptchaService {

    public Randomizer randomizer;

    public void setRandomizer(Randomizer randomizer) {
        this.randomizer = randomizer;
    }

    public Captcha generateCaptcha() {
        Captcha captcha = new Captcha(randomizer.getPattern(),
                randomizer.getOperand(),
                randomizer.getOperator(),
                randomizer.getOperand());
        return captcha;
    }
}
