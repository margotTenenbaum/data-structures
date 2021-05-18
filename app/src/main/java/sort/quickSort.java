package sort;

public class quickSort {

    public static void quicksort(int[] input) {
        quicksort(input, 0, input.length - 1);
    }

    public static void quicksort(int[] input, int leftP, int rightP) {
        if (leftP >= rightP) {
            return;
        }
        int pivot = input[(leftP + rightP) / 2];
        int index = partition(input, leftP, rightP, pivot);
        quicksort(input, leftP, index - 1);
        quicksort(input, index, rightP);
    }

    public static int partition(int[] input, int leftP, int rightP, int pivot) {
        while (leftP <= rightP) {
            while (input[leftP] < pivot) {
                leftP++;
            }
            while (input[rightP] > pivot) {
                rightP--;
            }
            if (leftP <= rightP) {
                int tempR = input[rightP];
                int tempL = input[leftP];
                input[rightP] = tempL;
                input[leftP] = tempR;
                leftP++;
                rightP--;
            }
        }
        return leftP;
    }
}