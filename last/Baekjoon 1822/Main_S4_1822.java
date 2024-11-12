import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int nA = Integer.parseInt(st.nextToken()), nB = Integer.parseInt(st.nextToken());
		TreeSet<Integer> A = new TreeSet<>();
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<nA;i++)
			A.add(Integer.parseInt(st.nextToken()));
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<nB;i++)
			A.remove(Integer.parseInt(st.nextToken()));
		sb.append(A.size()+"\n");
		while(A.size()>0)
			sb.append(A.pollFirst()+" ");
		System.out.println(sb.toString());
	}
}
