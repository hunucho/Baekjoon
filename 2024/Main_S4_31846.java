import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        int Q = Integer.parseInt(br.readLine());
        for (int q = 0; q < Q; q++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken()), ans=0;
            String s = S.substring(l-1, r);
            for(int i=0;i<s.length()-1;i++){
                int cnt=0, k=i+1;
                for(int j=0;i-j>=0 && k+j<s.length();j++)
                    if(s.charAt(i-j)==s.charAt(k+j))
                        cnt++;
                ans= Math.max(ans, cnt);
            }
            System.out.println(ans);
        }
    }
}