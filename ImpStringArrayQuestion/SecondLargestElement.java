package ImpStringArrayQuestion;

public class SecondLargestElement {
    public static int secondlargest(int[] arr){
        int n=arr.length;
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            } else if (arr[i]>secondlargest && arr[i]!=largest) {
                secondlargest=arr[i];
            }
        }
        return secondlargest == Integer.MIN_VALUE ? -1 : secondlargest;
    }
    public static void main(String[] args){
        int[] arr = {6,6,6,6};
        int res = secondlargest(arr);
        System.out.print(res);
    }
}
