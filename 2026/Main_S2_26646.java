import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), ans=0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] H = new int [N];
        for(int i=0;i<N;i++) {
            H[i] = Integer.parseInt(st.nextToken());
            if(i>0)
                ans+=(int)(Math.pow(H[i-1]+H[i], 2) + Math.pow(H[i]-H[i-1], 2));
        }
        System.out.print(ans);
    }
}