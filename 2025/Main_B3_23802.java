import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                sb.append("@@@@@");
            sb.append("\n");
        }
        String S = "@".repeat(N);
        for (int i = 0; i < 4 * N; i++)
            sb.append(S).append("\n");
        System.out.print(sb);
    }
}