package car;

import org.junit.jupiter.api.Test;
import tdd.HighestNumberFinder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgeFinderTest {
    @Test
    public void first_half_year() {
        //arrange
        String input = "xy05xxx";
        AgeFinder cut = new AgeFinder();
        String expectedResult = "55";

        //act
        String actualResult = cut.findNextAge(input);

        //assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void second_half_year() {
        //arrange
        String input = "xy55xxx";
        AgeFinder cut = new AgeFinder();
        String expectedResult = "06";

        //act
        String actualResult = cut.findNextAge(input);

        //assert
        assertEquals(expectedResult, actualResult);
    }

}
