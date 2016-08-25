/**
 * Created by cadet on 8/25/2016 AD.
 */
public class TennisScoreCounter {

    private int aScore;
    private int bScore;

    public int initScoreA() {
        return aScore;
    }

    public int initScoreB() {
        return bScore;
    }

    public void hitButtonA() {
        this.aScore++;
    }

    public int getLastAScore() {
        return this.aScore;
    }

    public void hitButtonB() {
        this.bScore++;
    }

    public int getLastBScore() {
        return bScore;
    }
}
