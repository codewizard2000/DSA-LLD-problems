public class MinimumSwaps {
    public static int swap(int[] A,int B ){
        int goodcount=0;
        for(int i=0;i<A.length;i++){
            if(A[i]<=B){
                goodcount++;
            }
        }
        int badcount=0;
        for(int i=0;i<goodcount;i++){
            if(A[i]>B){
                badcount++;
            }
        }

        int totalbadcount=badcount;
        for(int i=goodcount;i<A.length;i++){
            if(A[i]>B){
                totalbadcount++;
            }
            if(A[i-goodcount]>B){
                totalbadcount--;
            }
            badcount=Math.min(badcount,totalbadcount);

        }
        return badcount;
    }

}
