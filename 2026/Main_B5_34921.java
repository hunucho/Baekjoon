import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A=Integer.parseInt(st.nextToken()), T=Integer.parseInt(st.nextToken());
        int P=10+2*(25-A+T);
        System.out.print(Math.max(0, P));
    }
}