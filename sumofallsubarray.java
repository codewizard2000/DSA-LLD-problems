public class sumofallsubarray {
    public static int sum(int[] array){
        int ans=0;
        for(int i=0;i<array.length;i++){
            int sum=0;
            for(int j=i;j<array.length;j++){
                sum=sum+array[j];
            }
            ans=ans+sum;
        }
        return ans;
    }
    public static void main(String[] args){
        int[] array = {1,2,3,4};
        int result = sum(array);
        System.out.print(result);
    }
}
