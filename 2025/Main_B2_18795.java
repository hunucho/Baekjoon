import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
        long ans=0;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            ans+=Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++)
            ans+=Integer.parseInt(st.nextToken());
        System.out.println(ans);

    }
}