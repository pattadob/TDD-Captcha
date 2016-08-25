import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cadet on 8/25/2016 AD.
 */
public class TennisScoreCounterUnitTest {

    @Test
    public void initScoreAShouldBe0(){
        TennisScoreCounter tennisScoreCounter = new TennisScoreCounter();
        assertEquals(0, tennisScoreCounter.initScoreA());
    }

    @Test
    public void initScoreBShouldBe0(){
        TennisScoreCounter tennisScoreCounter = new TennisScoreCounter();
        assertEquals(0, tennisScoreCounter.initScoreB());
    }

    @Test
    public void hitAOnceShouldAddScore1ToA(){
        TennisScoreCounter tennisScoreCounter = new TennisScoreCounter();
        tennisScoreCounter.hitButtonA();
        assertEquals(1, tennisScoreCounter.getLastAScore());
    }

    @Test
    public void hitBOnceShouldAddScore1ToB(){
        TennisScoreCounter tennisScoreCounter = new TennisScoreCounter();
        tennisScoreCounter.hitButtonB();
        assertEquals(1, tennisScoreCounter.getLastBScore());
    }

    @Test
    public void hitATwiceShouldAddScore2ToA(){
        TennisScoreCounter tennisScoreCounter = new TennisScoreCounter();
        tennisScoreCounter.hitButtonA();
        tennisScoreCounter.hitButtonA();
        assertEquals(2, tennisScoreCounter.getLastAScore());
    }

    @Test
    public void hitBTwiceShouldAddScore2ToB(){
        TennisScoreCounter tennisScoreCounter = new TennisScoreCounter();
        tennisScoreCounter.hitButtonB();
        tennisScoreCounter.hitButtonB();
        assertEquals(2, tennisScoreCounter.getLastBScore());
    }

}
