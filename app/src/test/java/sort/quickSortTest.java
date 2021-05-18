package sort;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class quickSortTest {
    private int[] allPositive = {3, 4, 1, 8, 2};

    private int[] withNegatives = {3, -4, 1, -8, 2};

    private int[] withDoubles = {3, 4, 4, 2, 1, 8, 2};

    private int[] emptyArray = {};

    @Test
    public void quickSort_sortsArrayOfPositiveNumbers() {
        int[] expected = {1, 2, 3, 4, 8};
        int[] actual = quickSort.quicksort(allPositive);
        assertEquals(expected, actual);
    }
}