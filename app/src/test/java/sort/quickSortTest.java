package sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class quickSortTest {
    private int[] allPositive = {3, 4, 1, 8, 2};

    private int[] withNegatives = {3, -4, 1, -8, 2};

    private int[] withDoubles = {3, 4, 4, 2, 1, 8, 2};

    private int[] emptyArray = {};

    private int[] sizeOne = {1};

    @Test
    public void quickSort_canHandleInputArrayOfSize0() {
        int[] expected = {};
        int[] actual = quickSort.quicksort(emptyArray);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void quickSort_canHandleInputArrayOfSize1() {
        int[] expected = {1};
        int[] actual = quickSort.quicksort(sizeOne);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void quickSort_sortsArrayOfPositiveNumbers() {
        int[] expected = {1, 2, 3, 4, 8};
        int[] actual = quickSort.quicksort(allPositive);
        assertArrayEquals(expected, actual);
    }
}