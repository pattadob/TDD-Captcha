import org.junit.Test;

import java.util.Random;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by cadet on 8/24/2016 AD.
 */
public class RandomUnitTest {

    @Test
    public void patternShouldBeCalledOnce(){
        Randomizer randomizer = new Randomizer();
        randomizer.setRandom(new MyRandom());
        randomizer.getPattern();
        assertEquals(1,((MyRandom)randomizer.random).getCalls());
        assertEquals(2,((MyRandom)randomizer.random).getBounds());
        // how many times it's called  -- only 1

    }

    @Test
    public void operatorShouldBeCalledOnce(){
        Randomizer randomizer = new Randomizer();
        randomizer.setRandom(new MyRandom());
        randomizer.getOperator();
        assertEquals(1,((MyRandom)randomizer.random).getCalls());
        assertEquals(3,((MyRandom)randomizer.random).getBounds());
        // how many times it's called  -- only 1

    }

    @Test
    public void operandShouldBeCalledOnce(){
        Randomizer randomizer = new Randomizer();
        randomizer.setRandom(new MyRandom());
        randomizer.getOperand();
        assertEquals(1,((MyRandom)randomizer.random).getCalls());
        assertEquals(9,((MyRandom)randomizer.random).getBounds());
        // how many times it's called  -- only 1

    }

    public class MyRandom extends Random {
        int calls = 0;
        int bounds;

        @Override
        public int nextInt(int bound) {
            calls++;
            bounds = bound;
            return super.nextInt(bound);
        }

        public int getCalls(){
            return calls;
        }

        public int getBounds() {
            return bounds;
        }
    }


}
