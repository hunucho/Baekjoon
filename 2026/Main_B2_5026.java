import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String S = br.readLine();
            if(S.contains("=")) {
                sb.append("skipped");
            }
            else{
                StringTokenizer st = new StringTokenizer(S, "+");
                int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
                sb.append(a+b);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}