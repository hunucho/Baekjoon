import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), A = Integer.parseInt(st.nextToken())-1;
        int m = M/2+1;
        while(true){
            int call = Integer.parseInt(br.readLine()), b;
            if(call == m)
                break;
            if(A>m)
                b = (A+call-m)%N;
            else
                b = (A+call+N-m)%N;
            sb.append(b+1).append("\n");
            A=b;
        }
        sb.append(0);
        System.out.print(sb);
    }
}
