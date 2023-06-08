import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<int []> dq = new ArrayDeque<>();
        for(int i=1;i<=N;i++)
        	dq.add(new int [] {Integer.parseInt(st.nextToken()), i});
        while(true) {
        	int dir = dq.peek()[0];
        	sb.append(dq.poll()[1]+" ");
        	if(dq.size()==0)
        		break;
        	if(dir>0) {
        		dir--;
        		for(int i=0;i<dir;i++)
        			dq.addLast(dq.pollFirst());
        	} else {
        		for(int i=0;i<Math.abs(dir);i++)
        			dq.addFirst(dq.pollLast());
        	}
        }
        System.out.println(sb.toString());
    }
}
