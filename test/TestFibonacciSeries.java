import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestFibonacciSeries {
    private FibonacciSeries fibonacciSeries;

    @Before
    public void setUp() throws Exception {
       fibonacciSeries=new FibonacciSeries();

    }

    @Test
    public void shouldReturnZeroWhenThePositionIsOne() {

        assertEquals(0,fibonacciSeries.generateFibonacciNumberForTheGivenPosition(1));

    }
    @Test
    public void shouldReturnOneWhenThePositionIsTwo() {

        assertEquals(1,fibonacciSeries.generateFibonacciNumberForTheGivenPosition(2));

    }
    @Test
    public void shouldReturnOneWhenThePositionIsThree() {

        assertEquals(1,fibonacciSeries.generateFibonacciNumberForTheGivenPosition(3));

    }
    @Test
    public void shouldReturnTwoWhenThePositionIsFour() {

        assertEquals(2,fibonacciSeries.generateFibonacciNumberForTheGivenPosition(4));

    }
    @Test
    public void shouldReturnThreeWhenThePositionIsFive() {

        assertEquals(3,fibonacciSeries.generateFibonacciNumberForTheGivenPosition(5));

    }
    @Test
    public void shouldReturnFiveWhenThePositionIsSix() {

        assertEquals(5,fibonacciSeries.generateFibonacciNumberForTheGivenPosition(6));

    }
    @Test
    public void shouldReturnSixHundredAndTenWhenThePositionIsSixteen() {

        assertEquals(610,fibonacciSeries.generateFibonacciNumberForTheGivenPosition(16));

    }



}
