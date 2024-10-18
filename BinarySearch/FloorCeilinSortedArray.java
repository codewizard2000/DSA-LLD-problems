package BinarySearch;

public class FloorCeilinSortedArray {
    public static int getFloor(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = -1; // Initialize to -1 to indicate no floor found if target is smaller than all elements
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= target) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int getCeil(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = n; // Initialize to n to indicate no ceil found if target is greater than all elements
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                ans = mid;// similar to lowert bound
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

        int floorIndex = getFloor(arr, target);
        int ceilIndex = getCeil(arr, target);

        if (floorIndex != -1) {
            System.out.println("The floor index of " + target + " is: " + floorIndex + " with value " + arr[floorIndex]);
        } else {
            System.out.println("No floor found for " + target);
        }

        if (ceilIndex != arr.length) {
            System.out.println("The ceil index of " + target + " is: " + ceilIndex + " with value " + arr[ceilIndex]);
        } else {
            System.out.println("No ceil found for " + target);
        }
    }
}
