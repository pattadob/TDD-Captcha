import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cadet on 8/25/2016 AD.
 */
public class FizzbuzzUnitTest {

    @Test
    public void countShouldBeFizz() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        assertEquals("FIZZ", fizzbuzz.count(3));
    }

    @Test
    public void countShouldBeBuzz() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        assertEquals("BUZZ", fizzbuzz.count(5));
    }

    @Test
    public void countShouldBeFizzbuzz() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        assertEquals("FIZZBUZZ", fizzbuzz.count(15));
    }

    @Test
    public void countShouldBe7() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        assertEquals("7", fizzbuzz.count(7));
    }
}
