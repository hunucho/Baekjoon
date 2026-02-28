import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String S = "@".repeat(N);
        for(int j=0;j<N;j++)
            sb.append(S.repeat(5)).append("\n");
        for(int i=0;i<3*N;i++)
            sb.append(S).append(" ".repeat(3*N)).append(S).append("\n");
        for(int j=0;j<N;j++)
            sb.append(S.repeat(5)).append("\n");
        System.out.print(sb);
    }
}