import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), X=Integer.parseInt(st.nextToken());
        int ans=-1;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int S=Integer.parseInt(st.nextToken()), T=Integer.parseInt(st.nextToken());
            if(S+T<=X)
                ans=Math.max(ans, S);
        }
        System.out.print(ans);
    }
}