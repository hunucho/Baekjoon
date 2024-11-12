import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        for(int n=0;n<N;n++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), "-");
            String str = st.nextToken();
            int D = Integer.parseInt(st.nextToken());
            int l = 0;
            for (int i = 2; i >= 0; i--)
                l += (str.charAt(2-i) - 'A') * Math.pow(26, i);
            System.out.println(Math.abs(l - D) <= 100 ? "nice" : "not nice");
        }
    }
}