import java.util.*;
import java.io.*;

class Main {
    static int N, M;
    static int len [];
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M=Integer.parseInt(st.nextToken());
        N=Integer.parseInt(st.nextToken());
        len = new int [N];
        st = new StringTokenizer(br.readLine());
        int max=0;
        for(int i=0;i<N;i++) {
            len[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, len[i]);
        }
        System.out.println(ps(1, max));
    }

    public static int ps (int l, int r){
        int ans=0;
        while(l<=r){
            int cnt=0;
            int m=(l+r)/2;
            for(int i=0;i<N;i++)
                cnt+=len[i]/m;
            if(cnt>=M) {
                ans=Math.max(ans, m);
                l=m+1;
            }
            else
                r=m-1;
        }
        return ans;
    }
}