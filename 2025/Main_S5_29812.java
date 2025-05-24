import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String S=br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int D=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
        int [] cnt = new int [26];
        int ans=0, tmp=0;
        for(char ch:S.toCharArray()) {
            if(Character.isUpperCase(ch)) {
                ans+=Math.min(tmp*D, D+M);
                tmp=0;
                cnt[ch - 'A']++;
            }
            else {
                tmp++;
            }
        }
        ans+=Math.min(tmp*D, D+M);
        System.out.println(ans==0?"Nalmeok":ans);
        ans=999999;
        for(char ch:"HYU".toCharArray())
            ans=Math.min(ans, cnt[ch-'A']);
        System.out.println(ans==0?"I love HanYang University":ans);
    }
}