package BinarySearch;

public class LowerBound {
    public static int getLowerBound(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {// search and insert question will work with lower bound
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
        int lowerBoundIndex = getLowerBound(arr, target);
        System.out.println("The lower bound index of " + target + " is: " + lowerBoundIndex);
    }
}
