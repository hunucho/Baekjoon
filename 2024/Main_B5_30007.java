import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A=Integer.parseInt(st.nextToken()), B=Integer.parseInt(st.nextToken()), X=Integer.parseInt(st.nextToken());
            int W=A*(X-1)+B;
            System.out.println(W);
        }
    }
}