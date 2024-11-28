import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int N=Integer.parseInt(br.readLine());
            if(N==-1)
                break;
            int ans = divide(N);
            if(ans==-1)
                System.out.printf("%d coconuts, no solution\n", N);
            else
                System.out.printf("%d coconuts, %d people and 1 monkey\n", N, ans);
        }
    }

    public static int divide(int N){
        int ret = -1;
        for(int k=N-1;k>0;k--){
            int n=N;
            boolean pass=true;
            for(int i=1;i<=k;i++){
                if((n-1)%k==0)
                    n=n-1-(n/k);
                else {
                    pass=false;
                    break;
                }
            }
            if(n>=0 && n%k==0 && pass)
                return k;
        }
        return ret;
    }
}