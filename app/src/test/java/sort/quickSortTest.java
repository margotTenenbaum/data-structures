package sort;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class quickSortTest {
    private int[] allPositive = {3, 4, 1, 8, 2};

    private int[] threeNums = {5, 7, 6};

    private int[] withNegatives = {3, -4, 1, -8, 2};

    private int[] withDoubles = {3, 4, 4, 2, 1, 8, 2};

    private int[] emptyArray = {};

    private int[] sizeOne = {1};

    @Test
    public void quickSort_canHandleInputArrayOfSize0() {
        int[] expected = {};
        quickSort.quicksort(emptyArray);
        assertArrayEquals(expected, emptyArray);
    }

    @Test
    public void quickSort_canHandleInputArrayOfSize1() {
        int[] expected = {1};
        quickSort.quicksort(sizeOne);
        assertArrayEquals(expected, sizeOne);
    }

    @Test
    public void quickSort_sortsArrayOf3Numbers() {
        int[] expected = {5, 6, 7};
        quickSort.quicksort(threeNums);
        assertArrayEquals(expected, threeNums);
    }

    @Test
    public void quickSort_sortsArrayOfPositiveNumbers() {
        int[] expected = {1, 2, 3, 4, 8};
        quickSort.quicksort(allPositive);
        assertArrayEquals(expected, allPositive);
    }

    @Test
    public void quickSort_sortsArrayWithNegativeNumbers() {
        int[] expected = { -8, -4, 1, 2, 3};
        quickSort.quicksort(withNegatives);
        assertArrayEquals(expected, withNegatives);
    }

    @Test
    public void quickSort_sortsArrayWithDuplicateNumbers() {
        int[] expected = { 1, 2, 2, 3, 4, 4, 8};
        quickSort.quicksort(withDoubles);
        assertArrayEquals(expected, withDoubles);
    }
}