import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
            System.out.println(N>=12 && M>=4?11*M+4:-1);
        }
    }
}