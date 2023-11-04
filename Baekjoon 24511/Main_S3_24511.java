import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        Deque<String> dq = new ArrayDeque<>();

        StringTokenizer st1 = new StringTokenizer(br.readLine()), st2 = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            if (st1.nextToken().equals("0"))
                dq.addLast(st2.nextToken());
            else
                st2.nextToken();
        }
        int M = Integer.parseInt(br.readLine());
        st2 = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++) {
            dq.addFirst(st2.nextToken());
            sb.append(dq.pollLast()+" ");
        }
        System.out.println(sb);
    }
}
