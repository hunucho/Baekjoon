import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), K=Integer.parseInt(st.nextToken()), P=Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int ans=0;
        for(int i=0;i<N;i++){
            int cnt=0;
            for(int j=0;j<K;j++){
                int tmp=Integer.parseInt(st.nextToken());
                if(tmp==0)
                    cnt++;
            }
            if(cnt<P)
                ans++;
        }
        System.out.print(ans);
    }
}