public class longestpalindromicsubstring {
    int start;
    int end;
    public String solve(String str){
        int n=str.length();

        for(int i=0;i<n-1;i++){
            int p1=i;
            int p2=i+1;
            expand(str,p1,p2);
        }
        for(int i=1;i<n-1;i++){
            int p1 = i-1;
            int p2=i+1;
            expand(str,p1,p2);
        }

        return str.substring(start,end+1);
    }

    public void expand(String str, int p1, int p2){
        while(p1>=0 && p2<str.length() && str.charAt(p1)==str.charAt(p2)){
            p1--;
            p2++;
        }

        if(p2-p1-1>end-start+1){
            start=p1+1;
            end=p2-1;
        }

    }

    public static void main(String[] args){
        String str = "aaaabaaa";
        longestpalindromicsubstring H = new longestpalindromicsubstring();
        String result = H.solve(str);
        System.out.println(result);

    }
}
