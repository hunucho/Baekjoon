package silver;

import java.io.*;
import java.util.*;

public class Main_S3_1269 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int an=Integer.parseInt(st.nextToken()), bn=Integer.parseInt(st.nextToken()), ans=0;
		HashSet<Integer> A = new HashSet<Integer>(), B = new HashSet<Integer>();
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<an;i++)
			A.add(Integer.parseInt(st.nextToken()));
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<bn;i++) {
			int temp=Integer.parseInt(st.nextToken());
			if(A.contains(temp))
				A.remove(temp);
			else
				A.add(temp);
		}
		System.out.println(A.size());
	}
}
