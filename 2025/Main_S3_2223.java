import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken());
            int tmp = 0, cur = d, j = 0;
            for (; j < t; j++) {
                cur -= s;
                if (cur > 0)
                    tmp++;
                else
                    break;
            }
            if (tmp > 0)
                tmp += (t - j) / 2;

            min = Math.min(min, tmp);
        }
        if(min==Integer.MAX_VALUE)
            min=t;
        System.out.print(min * x);
    }
}
/*

10 1 1
10 3


 */