import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
            long ans = ((n-m) * m)+1;
            sb.append(ans).append("\n");
        }
        System.out.print(sb);

        /*

        1
        1 1
        1 2 1
        1 3 3 1
        1 4 5 4 1
        1 5 7 7 5 1
        1 6 9 X 9 6 1

        M열에 따른 증가값을 아래에 적으면
        0 1 2 3 4 5 7 와 같다

        M열의 경우 N행이 증가할때마다 [M]씩 증가함.
        */
    }
}
