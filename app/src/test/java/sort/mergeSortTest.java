package sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class mergeSortTest {
    private int[] allPositive = {3, 4, 1, 8, 2};

    private int[] threeNums = {5, 7, 6};

    private int[] withNegatives = {3, -4, 1, -8, 2};

    private int[] withDoubles = {3, 4, 4, 2, 1, 8, 2};

    private int[] emptyArray = {};

    private int[] sizeOne = {1};

    @Test
    public void mergeSort_canHandleInputArrayOfSize0() {
        int[] expected = {};
        mergeSort.mergesort(emptyArray);
        assertArrayEquals(expected, emptyArray);
    }

    @Test
    public void mergeSort_canHandleInputArrayOfSize1() {
        int[] expected = {1};
        mergeSort.mergesort(sizeOne);
        assertArrayEquals(expected, sizeOne);
    }

    @Test
    public void mergeSort_sortsArrayOf3Numbers() {
        int[] expected = {5, 6, 7};
        mergeSort.mergesort(threeNums);
        assertArrayEquals(expected, threeNums);
    }

    @Test
    public void mergeSort_sortsArrayOfPositiveNumbers() {
        int[] expected = {1, 2, 3, 4, 8};
        mergeSort.mergesort(allPositive);
        assertArrayEquals(expected, allPositive);
    }

    @Test
    public void mergeSort_sortsArrayWithNegativeNumbers() {
        int[] expected = { -8, -4, 1, 2, 3};
        mergeSort.mergesort(withNegatives);
        assertArrayEquals(expected, withNegatives);
    }

    @Test
    public void mergeSort_sortsArrayWithDuplicateNumbers() {
        int[] expected = { 1, 2, 2, 3, 4, 4, 8};
        mergeSort.mergesort(withDoubles);
        assertArrayEquals(expected, withDoubles);
    }
}