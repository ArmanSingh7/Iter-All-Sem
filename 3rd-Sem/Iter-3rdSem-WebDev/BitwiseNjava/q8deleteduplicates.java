public class q8deleteduplicates {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 3, 2, 5, 6, 1};

        // Removing duplicates in-place
        int[] uniqueArray = removeDuplicates(originalArray);

        // Display the array after removing duplicates
        System.out.print("Array after removing duplicates: ");
        for (int value : uniqueArray) {
            System.out.print(value + " ");
        }
    }

    private static int[] removeDuplicates(int[] array) {
        int n = array.length;
        if (n == 0 || n == 1) {
            return array;
        }

        // Removing duplicates in-place
        int newSize = 1;

        for (int i = 1; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < newSize; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                array[newSize] = array[i];
                newSize++;
            }
        }

        // Creating a new array with the distinct elements
        int[] result = new int[newSize];
        System.arraycopy(array, 0, result, 0, newSize);

        return result;
    }
}