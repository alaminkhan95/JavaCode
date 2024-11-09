package array;

public class BubbleSort {

    /**
     *
     * Sort an array without using in-built
     * method
     * @param args
     */

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 7, 1}; // Array to be sorted

        // Outer loop - Controls the number of passes through the array
        for (int pass = 0; pass < numbers.length - 1; pass++) {

            // Inner loop - Moves the largest unsorted element to its correct position
            for (int index = 0; index < numbers.length - 1 - pass; index++) {

                // Check if the current element is greater than the next element
                if (numbers[index] > numbers[index + 1]) {

                    // Swap the elements if they are in the wrong order
                    int temp = numbers[index];
                    numbers[index] = numbers[index + 1];
                    numbers[index + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.print("Sorted Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
