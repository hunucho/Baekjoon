import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), K=Integer.parseInt(st.nextToken());
        int [] a = new int [N], cnt = new int [100001];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            a[i]=Integer.parseInt(st.nextToken());
        int l=0, r=0, tmp=0, ans=0;
        while(l<=r && l<N){
            if(r<N && cnt[a[r]]+1<=K) {
                cnt[a[r++]]++;
                tmp++;
            } else {
                cnt[a[l++]]--;
                tmp--;
            }
            ans=Math.max(ans, tmp);
        }
        System.out.print(ans);
    }
}