package master;

public class LongestConsecutiveSequenceFinder {


    public static void main(String[] args) {
        longestConsecutiveSequenceFinder();
    }

    public static void longestConsecutiveSequenceFinder(){

        int[] arr = {11, 22, 33, 1, 2, 3, 4, 5, 6, 67};

        boolean inSequence = false;
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 == arr[i + 1]) {
                    System.out.print(arr[i] + " "); // Print the start of a new sequence
                    count++;
                    inSequence = true;
                // Continue the sequence
            } else {
                if (inSequence) {
                    System.out.print(arr[i] + " "); // Print the last element of the sequence
                    count++;
                    inSequence = false; // End of the current sequence
                }
            }
        }

        System.out.println("\nCount of consecutive numbers: " + count);
    }
    }

