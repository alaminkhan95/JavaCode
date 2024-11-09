package array;

public class CommonElementsFinder {

    public static void main(String[] args) {
        // Initialize two arrays with sample data
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {4, 5, 6, 7, 8};

        // Iterate over each element in the first array
        for (int i = 0; i < firstArray.length; i++) {
            // For each element in the first array, iterate over each element in the second array
            for (int j = 0; j < secondArray.length; j++) {
                // Check if the elements in both arrays match
                if (firstArray[i] == secondArray[j]) {
                    // Print the common element
                    System.out.println("Common element found: " + firstArray[i]);
                }
            }
        }
    }
}
