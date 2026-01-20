import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int L=Integer.parseInt(st.nextToken()), R = Integer.parseInt(st.nextToken()), A = Integer.parseInt(st.nextToken());
        int min=Math.min(L, R), max = Math.max(L, R), ans = 0;
        int a = Math.min(A, max-min);
        min+=a;
        A-=a;
        ans+=min*2 + (A/2*2);
        System.out.print(ans);
    }
}