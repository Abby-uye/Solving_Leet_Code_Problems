import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchInsertPositionTest {
    @Test
    public void testThatCanSearchInsertPosition() {
        int[] input = {1, 3, 5, 6};
        int target = 5;
        int expected = 2;
        int actual = SearchInsertPosition.searchInsert(input, target);
        assertEquals(expected,actual);


    }

    @Test
    public void testThatCanSearchInsertPosition2() {
        int[] input = {1, 3, 5, 6};
        int target = 7;
        int expected = 4;
        int actual = SearchInsertPosition.searchInsert(input, target);
        assertEquals(expected,actual);


    }
}