import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int R = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken());
        int[] dx = new int[]{-1, 1, 0, 0, 0}, dy = new int[]{0, 0, -1, 1, 0};
        char[][] arr = new char[R][N];
        for (int i = 0; i < R; i++)
            arr[i] = br.readLine().toCharArray();
        if (C % 2 == 0) {
            for (int i = 0; i < R; i++)
                sb.append("O".repeat(N) + "\n");
            System.out.println(sb.toString());
            return;
        }

        for (int time = 1; time < C; time++) {
            if(time%2==0)
                continue;
            char [][] act = new char[R][N];
            for(int i=0;i<R;i++)
                act[i]="N".repeat(N).toCharArray();
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < N; j++) {
                    if (arr[i][j] == 'O') {
                        for (int k = 0; k < 5; k++) {
                            int nx = i + dx[k], ny = j + dy[k];
                            if (nx >= 0 && nx < R && ny >= 0 && ny < N)
                                act[nx][ny] = '.';
                        }
                    }
                }
            }
            for(int i=0;i<R;i++)
                arr[i]=String.valueOf(act[i]).replaceAll("N","O").toCharArray();
        }
        for(int i=0;i<R;i++)
            sb.append(String.valueOf(arr[i])+"\n");
        System.out.println(sb.toString());
    }
}
