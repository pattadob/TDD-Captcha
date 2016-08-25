/**
 * Created by cadet on 8/25/2016 AD.
 */
public class Fizzbuzz {

    public String count(int value) {
        String result = "";
        if (isFizz(value)) {
            result += "FIZZ";
        }

        if (isBuzz(value)) {
            result += "BUZZ";
        }

        if (result.equals("")) {
            result += value;
        }

        return result;
    }

    private boolean isFizz(int value) {
        return value % 3 == 0;
    }

    private boolean isBuzz(int value) {
        return value % 5 == 0;
    }
}
