import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        long ans=1;
        String S = br.readLine();
        int [] cnt = new int [26];
        for(int i=0;i<L;i++)
            cnt[S.charAt(i)-'A']++;
        ans = (ans*cnt['A'-'A'])%1000000007;
        ans = (ans*cnt['C'-'A'])%1000000007;
        ans = (ans*cnt['G'-'A'])%1000000007;
        ans = (ans*cnt['T'-'A'])%1000000007;
        System.out.println(ans);
    }
}