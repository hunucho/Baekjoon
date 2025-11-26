import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        long [] dp = new long [N];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[N-1]=0;
        for(int i=N-1;i>=0;i--){
            char cur = S.charAt(i);
            for(int j=i-1;j>=0;j--){
                int k=i-j;
                if(cur == 'B' && S.charAt(j)=='J'){
                    dp[j]= Math.min(dp[j],dp[i]+k*k);
                } else if(cur=='O' && S.charAt(j)=='B'){
                    dp[j]= Math.min(dp[j],dp[i]+k*k);
                } else if(cur=='J' && S.charAt(j)=='O'){
                    dp[j]= Math.min(dp[j],dp[i]+k*k);
                }
            }
        }
        System.out.print(dp[0]==Integer.MAX_VALUE?-1:dp[0]);
    }
}
