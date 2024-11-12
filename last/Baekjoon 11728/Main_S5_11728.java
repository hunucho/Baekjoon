import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
			pq.add(Integer.parseInt(st.nextToken()));
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<m;i++)
			pq.add(Integer.parseInt(st.nextToken()));
		for(int i=0;i<n+m;i++)
			sb.append(pq.poll()+" ");
		System.out.println(sb.toString());		
	}
}
