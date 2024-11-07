package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HighestNumberFinderTest {
    @Test
    public void find_highest_in_array_of_one_expect_single_item() throws IllegalAccessException {
        //arrange
        int input[] ={10};
        HighestNumberFinder cut =new HighestNumberFinder();
        int expectedResult = 10;

        //act
        int actualResult = cut.findHighestNumber(input);

        //assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void find_highest_in_array_of_two_descending_expect_first_element() throws IllegalAccessException {
        //arrange
        int input[] = {13, 4};
        HighestNumberFinder cut =new HighestNumberFinder();
        int expectedResult = 13;

        //act
        int actualResult = cut.findHighestNumber(input);

        //assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void find_highest_in_array_of_two_ascending_expect_second_element() throws IllegalAccessException {
        //arrange
        int input[] = {7, 13};
        HighestNumberFinder cut =new HighestNumberFinder();
        int expectedResult = 13;

        //act
        int actualResult = cut.findHighestNumber(input);

        //assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void find_highest_in_array_if_several_equal_and_max() throws IllegalAccessException {
        //arrange
        int input[] = {2, 23, 4, 23, 1};
        HighestNumberFinder cut =new HighestNumberFinder();
        int expectedResult = 23;

        //act
        int actualResult = cut.findHighestNumber(input);

        //assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void find_highest_in_array_if_negative() throws IllegalAccessException {
        //arrange
        int input[] = {-2, -23, -4, -23, -1};
        HighestNumberFinder cut =new HighestNumberFinder();
        int expectedResult = -1;

        //act
        int actualResult = cut.findHighestNumber(input);

        //assert
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void find_highest_in_array_if_empty(){
        //arrange
        int input[] = {};
        HighestNumberFinder cut =new HighestNumberFinder();
        assertThrows(IllegalAccessException.class, ()->cut.findHighestNumber(input));
    }


}
