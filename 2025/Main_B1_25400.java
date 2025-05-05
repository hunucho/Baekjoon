import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()), ans=0, cnt=1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            int tmp = Integer.parseInt(st.nextToken());
            if(tmp==cnt)
                cnt++;
            else
                ans++;
        }
        System.out.print(ans);
    }
}