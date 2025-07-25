import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), K=Integer.parseInt(st.nextToken());
        int [] arr = new int [N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            arr[i]=Integer.parseInt(st.nextToken());
        int l=0, r=0, cnt=0, ans=Integer.MAX_VALUE;
        while(l<N && r<N){
            if(cnt<=ans && r<=N){
                cnt += arr[r++] == 1 ? 1 : 0;
            }
            if(cnt==K)
                ans = Math.min(ans, r-l);
            while(cnt>=K && l<N) {
                cnt -= arr[l++] == 1 ? 1 : 0;
                if(cnt==K)
                    ans = Math.min(ans, r-l);
            }
        }
        System.out.println(ans==Integer.MAX_VALUE?-1:ans);
    }
}