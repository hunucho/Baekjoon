import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken()), K=Integer.parseInt(st.nextToken());
        int ans=0;
        for(int i=0;i<N;i++){
            String S = br.readLine();
            int cnt = 0;
            for(char ch:S.toCharArray()){
                if(ch=='0')
                    cnt++;
                else{
                    if(cnt>=K)
                        ans+=cnt-K+1;
                    cnt=0;
                }
            }
            if(cnt>=K)
                ans+=cnt-K+1;
        }
        System.out.print(ans);
    }
}