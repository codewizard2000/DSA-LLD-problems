package BinarySearch;

public class NthRootOfNumberBS {
    public static int multiply(int mid, int n, int m){
        long ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*mid;
        }
        if(ans==m){
            return 1;
        }else if(ans>m){
            return 2;
        }else if(ans<m){
            return 0;
        }
        return -1;
    }

    public static int nthroot(int n, int m){
        int low=1;
        int high=m;
        while(low<=high){
            int mid = low+(high-low)/2;
            int midn = multiply(mid,n,m);
            if(midn==1){
                return mid;
            }
            else if(midn==0){
                low=mid+1;
            }else{
                high=mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args){
        int n=3;
        int m=27;
        int ans = nthroot(3,64);
        System.out.print(ans);
    }
}
