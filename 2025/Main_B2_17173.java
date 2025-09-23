import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws  Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken()), ans=0;
        int [] K=new int [M];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++)
            K[i] = Integer.parseInt(st.nextToken());
        for(int i=1;i<=N;i++)
            for(int j=0;j<M;j++)
                if(i%K[j]==0) {
                    ans += i;
                    break;
                }
        System.out.print(ans);
    }
}
