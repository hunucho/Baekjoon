import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE, last=0;
        for (int i = 0; i < N; i++) {
            int tmp=Integer.parseInt(st.nextToken());
            max=Math.max(max, tmp);
            if(min>tmp) {
                min = Math.min(min, tmp);
                max=tmp;
            }
            last = Math.max(last, max-min);
            sb.append(last+" ");
        }
        System.out.println(sb);
    }
}