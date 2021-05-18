package sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class bubbleSortTest {
    private int[] allPositive = {3, 4, 1, 8, 2};

    private int[] threeNums = {5, 7, 6};

    private int[] withNegatives = {3, -4, 1, -8, 2};

    private int[] withDoubles = {3, 4, 4, 2, 1, 8, 2};

    private int[] emptyArray = {};

    private int[] sizeOne = {1};

    @Test
    public void bubbleSort_canHandleInputArrayOfSize0() {
        int[] expected = {};
        bubbleSort.bubblesort(emptyArray);
        assertArrayEquals(expected, emptyArray);
    }

    @Test
    public void bubbleSort_canHandleInputArrayOfSize1() {
        int[] expected = {1};
        bubbleSort.bubblesort(sizeOne);
        assertArrayEquals(expected, sizeOne);
    }

    @Test
    public void bubbleSort_sortsArrayOf3Numbers() {
        int[] expected = {5, 6, 7};
        bubbleSort.bubblesort(threeNums);
        assertArrayEquals(expected, threeNums);
    }

    @Test
    public void bubbleSort_sortsArrayOfPositiveNumbers() {
        int[] expected = {1, 2, 3, 4, 8};
        bubbleSort.bubblesort(allPositive);
        assertArrayEquals(expected, allPositive);
    }

    @Test
    public void bubbleSort_sortsArrayWithNegativeNumbers() {
        int[] expected = { -8, -4, 1, 2, 3};
        bubbleSort.bubblesort(withNegatives);
        assertArrayEquals(expected, withNegatives);
    }

    @Test
    public void bubbleSort_sortsArrayWithDuplicateNumbers() {
        int[] expected = { 1, 2, 2, 3, 4, 4, 8};
        bubbleSort.bubblesort(withDoubles);
        assertArrayEquals(expected, withDoubles);
    }
}