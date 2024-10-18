package BinarySearch;

public class UpperBound {
    public static int getUpperBound(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 5, 6, 8};
        int target = 4;
        int upperBoundIndex = getUpperBound(arr, target);
        System.out.println("The upper bound index of " + target + " is: " + upperBoundIndex);
    }
}
