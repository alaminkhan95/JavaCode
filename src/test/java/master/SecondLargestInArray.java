package master;

public class SecondLargestInArray {

    public static void main(String[] args) {

        secondLargestInArray ();
        thirdLargestInArray();
        fourthLargestInArray();

    }

    public static void secondLargestInArray() {

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int temp;

        // Sort the array in descending order
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) { // Sort in descending order
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // Find the second unique largest element
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[0]) { // array[0] is the largest element
                System.out.println("The second largest element is: " + array[i]);
                break;
            }
        }
    }


    public static void thirdLargestInArray() {

        int[] array = {1, 2, 3, 4, 5, 6, 7};

        int temp;

        // Sort the array in descending order
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) { // Change comparison for descending order
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // Find the third unique largest element
        int count = 1; // Since the first element is the largest
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) { // Ensure it's a unique value
                count++;
            }
            if (count == 3) { // Check if it's the third unique element
                System.out.println("The third largest element is: " + array[i]);
                break;
            }
        }
    }

    public static void fourthLargestInArray() {

        int[] array = {1, 2, 3, 4, 5, 6, 7};

        int temp;

        // Sort the array in descending order
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) { // Sort in descending order
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // Find the fourth unique largest element
        int count = 1; // Since the first element is the largest
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) { // Check for a unique value
                count++;
            }
            if (count == 4) { // Stop at the fourth unique element
                System.out.println("The fourth largest element is: " + array[i]);
                break;
            }
        }
    }



}
