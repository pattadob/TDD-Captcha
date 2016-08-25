import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cadet on 8/25/2016 AD.
 */
public class ScoreAnnouncerUnitTest {

    @Test
    public void whenStartGameScoreShouldByLOVE_LOVE(){
        ScoreAnnouncer scoreAnnouncer = new ScoreAnnouncer();
        TennisScoreCounter tennisScoreCounter = new TennisScoreCounter();
        scoreAnnouncer.setTennisScoreCounter(tennisScoreCounter);
        assertEquals("LOVE-LOVE", scoreAnnouncer.anounceScore());
    }

    @Test
    public void whenBothScoreAreTheSameAndScoreIsLessThen3ShouldBeNormalAnnounce(){
        ScoreAnnouncer scoreAnnouncer = new ScoreAnnouncer();
        MyTennisScoreCounter tennisScoreCounter = new MyTennisScoreCounter();
        tennisScoreCounter.setScoreA(2);
        tennisScoreCounter.setScoreB(2);
        scoreAnnouncer.setTennisScoreCounter(tennisScoreCounter);
        assertEquals("30-ALL", scoreAnnouncer.anounceScore());
    }

    @Test
    public void whenBothScoreAreTheSameAndScoreIs3OrMoreShouldBeDEUCE(){
        ScoreAnnouncer scoreAnnouncer = new ScoreAnnouncer();
        MyTennisScoreCounter tennisScoreCounter = new MyTennisScoreCounter();
        tennisScoreCounter.setScoreA(4);
        tennisScoreCounter.setScoreB(4);
        scoreAnnouncer.setTennisScoreCounter(tennisScoreCounter);
        assertEquals("DEUCE", scoreAnnouncer.anounceScore());
    }



    @Test
    public void whenScoreLessThen3shouldbyAnnounceNormal(){
        ScoreAnnouncer scoreAnnouncer = new ScoreAnnouncer();
        MyTennisScoreCounter tennisScoreCounter = new MyTennisScoreCounter();
        tennisScoreCounter.setScoreA(0);
        tennisScoreCounter.setScoreB(1);
        scoreAnnouncer.setTennisScoreCounter(tennisScoreCounter);
        assertEquals("LOVE-15", scoreAnnouncer.anounceScore());
    }

    @Test
    public void whenScoreMoreThen3shouldbyAnnounceAdvance(){
        ScoreAnnouncer scoreAnnouncer = new ScoreAnnouncer();
        MyTennisScoreCounter tennisScoreCounter = new MyTennisScoreCounter();
        tennisScoreCounter.setScoreA(3);
        tennisScoreCounter.setScoreB(4);
        scoreAnnouncer.setTennisScoreCounter(tennisScoreCounter);
        assertEquals("ADV-B", scoreAnnouncer.anounceScore());
    }

    @Test
    public void whenScoreLessThen4AndDiffMore4shouldBeAnnounceWinner(){
        ScoreAnnouncer scoreAnnouncer = new ScoreAnnouncer();
        MyTennisScoreCounter tennisScoreCounter = new MyTennisScoreCounter();
        tennisScoreCounter.setScoreA(4);
        tennisScoreCounter.setScoreB(0);
        scoreAnnouncer.setTennisScoreCounter(tennisScoreCounter);
        assertEquals("A is Winner", scoreAnnouncer.anounceScore());
    }

    @Test
    public void whenScoreDiffMoreThen4AddDiffMoreThen2shouldBeAnnounceWinner(){
        ScoreAnnouncer scoreAnnouncer = new ScoreAnnouncer();
        MyTennisScoreCounter tennisScoreCounter = new MyTennisScoreCounter();
        tennisScoreCounter.setScoreA(6);
        tennisScoreCounter.setScoreB(4);
        scoreAnnouncer.setTennisScoreCounter(tennisScoreCounter);
        assertEquals("A is Winner", scoreAnnouncer.anounceScore());
    }

    public class MyTennisScoreCounter extends TennisScoreCounter{
        private int scoreA;
        private int scoreB;

        public void setScoreA(int scoreA) {
            this.scoreA = scoreA;
        }

        public void setScoreB(int scoreB) {
            this.scoreB = scoreB;
        }

        @Override
        public int getLastAScore() {
            return scoreA;
        }

        @Override
        public int getLastBScore() {
            return scoreB;
        }
    }
}
