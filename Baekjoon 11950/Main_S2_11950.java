import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
        int [][] cnt = new int [N][3];
        int ans=Integer.MAX_VALUE, tmp=0;
        for(int i=0;i<N;i++) {
            String S = br.readLine();
            for(char ch:S.toCharArray()){
                int j=0;
                if(ch=='W')
                    j=0;
                else if(ch=='B')
                    j=1;
                else if(ch=='R')
                    j=2;
                cnt[i][j]++;
            }
            if(i>0)
                for(int j=0;j<3;j++)
                    cnt[i][j]+=cnt[i-1][j];
        }
        for(int i=0;i<N-2;i++){
            for(int j=i+1;j<N-1;j++){
                ans = Math.min(ans, cnt[i][1]+cnt[i][2] + cnt[j][0]-cnt[i][0]+cnt[j][2]-cnt[i][2] + cnt[N-1][0]-cnt[j][0]+cnt[N-1][1]-cnt[j][1]);
            }
        }
        System.out.println(ans);
    }
}