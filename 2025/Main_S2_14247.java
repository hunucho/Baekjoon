import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int [] H = new int [N], A = new int [N];
        long ans=0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            ans+=Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            A[i]=Integer.parseInt(st.nextToken());
        Arrays.sort(A);
        for(int i=0;i<N;i++)
            ans+=A[i]*i;
        System.out.println(ans);
    }
}