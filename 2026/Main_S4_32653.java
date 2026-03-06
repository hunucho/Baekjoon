import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean [] chk = new boolean [26];
        long ans=1;
        for(int i=0;i<N;i++)
            chk[Integer.parseInt(st.nextToken())]=true;

        for(int i=2;i<=25;i++){
            if(chk[i]){
                ans*=i/gcd(ans, i);
            }
        }
        System.out.print(ans*2);
    }
    static long gcd(long a, long b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
}
