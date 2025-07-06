import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
        int[] grade = {4, 11, 23, 40, 60, 77, 89, 96, 100};
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < K; i++) {
            int G = Integer.parseInt(st.nextToken()) * 100 / N;
            for (int j = 0; j < 9; j++)
                if (G <= grade[j]) {
                    System.out.print((j + 1) + " ");
                    break;
                }
        }
    }
}