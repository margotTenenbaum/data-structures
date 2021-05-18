package sort;

public class mergeSort {
    public static void mergesort(int[] input) {
        mergesort(input, new int[input.length], 0, input.length - 1);
    }

    public static void mergesort(int[] input, int[] temp, int leftS, int rightE) {
        if (leftS >= rightE) {
            return;
        }
        int middle = (leftS + rightE) / 2;
        mergesort(input, temp, leftS, middle);
        mergesort(input, temp, middle + 1, rightE);
        merge(input, temp, leftS, rightE);
    }

    public static void merge(int[] input, int[] temp, int leftS, int rightE) {
        int leftE = (rightE + leftS) / 2;
        int rightS = leftE + 1;
        int size = rightE - leftS + 1;

        int left = leftS;
        int right = rightS;
        int index = leftS;

        while (left <= leftE && right <= rightE) {
            if (input[left] <= input[right]) {
                temp[index] = input[left];
                left++;
            } else {
                temp[index] = input[right];
                right++;
            }
            index++;
        }
        System.arraycopy(input, left, temp, index, leftE - left + 1);
        System.arraycopy(input, right, temp, index, rightE - right + 1);
        System.arraycopy(temp, leftS, input, leftS, size);

    }
}