import java.util.HashMap;
import java.util.Map;

/**
 * Created by cadet on 8/25/2016 AD.
 */
public class ScoreAnnouncer {

    private TennisScoreCounter tennisScoreCounter;

    public void setTennisScoreCounter(TennisScoreCounter tennisScoreCounter) {
        this.tennisScoreCounter = tennisScoreCounter;
    }

    public String anounceScore() {
        int scoreA = tennisScoreCounter.getLastAScore();
        int scoreB = tennisScoreCounter.getLastBScore();
        String announce = "";

        if (scoreA == scoreB){
            announce = getScoreIfBothAreEqual(scoreA);

        }else {
            announce = getScoreIfNotEqual(scoreA, scoreB);
        }

        return announce;
    }

    private String getScoreIfNotEqual(int scoreA, int scoreB) {
        String announce;Map<Integer, String> tennisNumberToText = new HashMap<Integer, String>();
        tennisNumberToText.put(0, "LOVE");
        tennisNumberToText.put(1, "15");
        tennisNumberToText.put(2, "30");
        tennisNumberToText.put(3, "40");
        tennisNumberToText.put(9999, "ADV");

        if (scoreA < 3 && scoreB < 3) {
            announce = tennisNumberToText.get(scoreA) + "-" + tennisNumberToText.get(scoreB);
        }else {
            if (scoreA - scoreB >= 2){
                announce = "A is Winner";
            }else if (scoreB - scoreA >= 2){
                announce = "B is Winner";
            }else if (scoreA - scoreB > 1){
                announce = tennisNumberToText.get(9999) + "-A" ;
            }else {
                announce = tennisNumberToText.get(9999) + "-B" ;
            }

        }
        return announce;
    }

    private String getScoreIfBothAreEqual(int scoreA) {
        String announce;Map<Integer, String> anounceEqualScore = new HashMap<Integer, String>();
        anounceEqualScore.put(0, "LOVE-LOVE");
        anounceEqualScore.put(1, "15-ALL");
        anounceEqualScore.put(2, "30-ALL");
        anounceEqualScore.put(3, "DEUCE");

        if (scoreA < 3) {
            announce = anounceEqualScore.get(scoreA);
        }else {
            announce = anounceEqualScore.get(3);
        }
        return announce;
    }
}
