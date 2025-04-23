import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long ans=0, cnt=0;
        for(int i=0;i<N;i++) {
            int tmp=Integer.parseInt(st.nextToken());
            cnt+=tmp==1?1:-1;
            ans+=cnt;
        }
        System.out.print(ans);
    }
}