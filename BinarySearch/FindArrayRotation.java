package BinarySearch;

public class FindArrayRotation {
    public static int findRotation(int[] arr){
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int min = Integer.MAX_VALUE;
        int index = -1;  // Initialize index

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if the middle element is the minimum
            if (arr[mid] < min) {
                min = arr[mid];
                index = mid;
            }

            // Determine which half of the array to search
            if (arr[low] <= arr[mid]) {
                // If the left side is sorted, the smallest element is not in this part
                // Move search to the right
                if (arr[low] < min) {
                    min = arr[low];
                    index = low;
                }
                low = mid + 1;
            } else {
                // If the right side is sorted, the smallest element is not in this part
                // Move search to the left
                high = mid - 1;
                if (arr[mid] < min) {
                    min = arr[mid];
                    index = mid;
                }
            }
        }

        return index;  // Return the index of the minimum element
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 12};  // Example array
        int rotationIndex = findRotation(arr);
        System.out.println("Rotation index: " + rotationIndex);
    }
}
