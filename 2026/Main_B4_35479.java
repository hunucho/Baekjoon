import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double R = Integer.parseInt(st.nextToken()), G = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());
        double r = R/255.0, g = G/255.0, b = B/255.0;
        double K = 1 - Math.max(r,Math.max(g, b));
        double C, M, Y;
        if (K == 1.0) {
            C = 0;
            M = 0;
            Y = 0;
        } else {
            C = (1 - r - K) / (1 - K);
            M = (1 - g - K) / (1 - K);
            Y = (1 - b - K) / (1 - K);
        }
        System.out.printf("%f %f %f %f", C, M, Y, K);
    }
}