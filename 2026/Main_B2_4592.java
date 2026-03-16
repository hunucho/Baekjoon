import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            if(N==0)
                break;
            int last = -1;
            for(int i=0;i<N;i++){
                int tmp = Integer.parseInt(st.nextToken());
                if(last != tmp)
                    sb.append(tmp).append(" ");
                last = tmp;
            }
            sb.append("$\n");
        }
        System.out.print(sb);
    }
}
