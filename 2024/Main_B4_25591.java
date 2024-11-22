import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        int a=100-N, b=100-M, c=100-a-b, d=a*b, q=d/100, r=d%100;
        System.out.printf("%d %d %d %d %d %d\n", a, b, c, d, q, r);
        if(d>=100)
            System.out.printf("%d %d",c+q, r);
        else
            System.out.printf("%d %d",100-a-b, r);
    }
}