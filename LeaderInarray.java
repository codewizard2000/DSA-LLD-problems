import java.util.ArrayList;

public class LeaderInarray {
    public static ArrayList<Integer> leader(int[] arr) {
        int n = arr.length;
        int leaders = arr[n - 1];
        ArrayList<Integer> l=new ArrayList<>();
        l.add(leaders);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > leaders) {
                leaders = arr[i];
                l.add(leaders);
            }
        }

        return l;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4};
        ArrayList<Integer> result = leader(arr);
        System.out.print(result);
    }
}

