import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
        int t1=N, t2=N/2, t3=N-N/2, t4=(N-1)/3+1;
        int ans=1;
        if(t1<=M)
            ans++;
        if(N>1){
            if(t2<=M)
                ans++;
            if(t3<=M)
                ans++;
        }
        if(N>2){
            if(t4<=M)
                ans++;
            if(t1+t4<=M)
                ans++;
            if(t2+t4<=M)
                ans++;
            if(t3+t4<=M)
                ans++;
        }
        System.out.println(ans);
    }
}