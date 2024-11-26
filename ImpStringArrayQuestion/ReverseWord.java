package ImpStringArrayQuestion;

public class ReverseWord {
    public static String reverse(String s) {
        int left = 0;
        String temp = "";
        String ans = "";
        int right = s.length() - 1;

        while (left <= right) {
            char ch = s.charAt(left);
            if (ch != ' ') {
                temp += ch;
            } else if (ch == ' ') {
                if (!ans.equals("")) {
                    ans = temp + " " + ans;
                } else {
                    ans = temp;
                }
                temp = "";
            }
            left++;
        }

        // Add the last word to the result
        if (!temp.equals("")) {
            if (!ans.equals("")) {
                ans = temp + " " + ans;
            } else {
                ans = temp;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String st = "TUF is great for interview preparation";
        String s = reverse(st);
        System.out.print(s);
    }
}
//tc=o(n) sc=o(i)


