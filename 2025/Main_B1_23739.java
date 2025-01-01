import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int ans=0, time=30;
        for(int i=0;i<N;i++) {
            int T=Integer.parseInt(br.readLine()), remain=T-time;
            if(remain<=T/2)
                ans++;
            time-=T;
            if(time<=0)
                time=30;
        }
        System.out.println(ans);
    }
}