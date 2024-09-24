public class ReverseWord {
    public static String reverse(String str){
        String[] words = str.trim().split("\\s+");
        int left = 0, right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        return String.join(" ",words);

    }
    public static void main(String[] args) {
        System.out.println(reverse("the sky is blue")); // Output: "blue is sky the"
        System.out.println(reverse("  hello world  ")); // Output: "world hello"
        System.out.println(reverse("a good   example")); // Output: "example good a"
    }

}
