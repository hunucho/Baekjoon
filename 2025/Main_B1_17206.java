import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int t=0;t<T;t++){
            int N=Integer.parseInt(st.nextToken()), sum=0, tmp=0;
            tmp = N/3;
            sum+=tmp*(tmp+1)/2*3;
            tmp = N/7;
            sum+=tmp*(tmp+1)/2*7;
            tmp = N/21;
            sum-=tmp*(tmp+1)/2*21;
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}