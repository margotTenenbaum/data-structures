package sort;

public class bubbleSort {
    public static void bubblesort(int[] input) {
        boolean change = false;

        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] > input[i+1]) {
                int temp = input[i];
                input[i] = input[i+1];
                input[i+1] = temp;
                change = true;
            }
        }
        if (change) {
            bubblesort(input);
        }
    }
}