import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), ans=0;
        long [] dp = new long [10];
        Arrays.fill(dp,1);
        for(int i=1;i<N;i++)
            for(int j=1;j<10;j++)
                dp[j]+=dp[j-1];
        System.out.println(Arrays.stream(dp).sum());
    }
}
