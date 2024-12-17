package ImpStringArrayQuestion;

public class BuyAndSellStock {
//    public static int bestprice(int[] arr){
//        int maxProfit=Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]<arr[j]){
//                    int currentProfit = arr[j]-arr[i];
//                    maxProfit=Math.max(maxProfit,currentProfit);
//                }
//            }
//        }
//        return maxProfit;
//    }
        public static int bestprice(int[] arr){
            int maxPro = 0;
            int minPrice = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                minPrice = Math.min(minPrice, arr[i]);
                maxPro = Math.max(maxPro, arr[i] - minPrice);
            }
            return maxPro;

        }

    public static void main(String[] args){
        int[] arr = {7,1,5,3,6,4};
        int result = bestprice(arr);
        System.out.print(result);
    }

}
