import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), L=Integer.parseInt(st.nextToken());
        System.out.print("1".repeat(L-1));
        System.out.print(N);
    }
}