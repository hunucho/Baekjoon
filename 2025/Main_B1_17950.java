import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H=Integer.parseInt(st.nextToken()), X=Integer.parseInt(st.nextToken());
        long MOD=1000000007,x=1, ans=0;
        for(int i=0;i<H;i++) {
            x=(x*X)%MOD;
            ans = (ans + (Integer.parseInt(br.readLine()) * x) % MOD)%MOD;
        }
        System.out.print(ans);
    }
}