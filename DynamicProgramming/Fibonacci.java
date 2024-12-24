package DynamicProgramming;

public class Fibonacci {
//    public static int recursive(int n){
//        if(n<=1){
//            return n;
//        }else{
//            return recursive(n-1)+recursive(n-2);
//        }
//    }
//    // TC =o(2N) two time recursive call
//    // sc = o(n) call stack

    public static int recursive(int n){
        if(n<=1){
            return n;
        }

        int[] dp  = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }

        return dp[n];
    }
    //tc = o(n)
    //sc = o(n)

    public static void main(String[] args){
        int n=10;
        int result = recursive(n);
        System.out.print(result);
    }
}
