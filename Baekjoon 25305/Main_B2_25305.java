import java.io.*;
import java.util.*;

public class Main_B2_25305 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()), k=Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		Integer [] stu = new Integer [n];
		for(int i=0;i<n;i++)
			stu[i]=Integer.parseInt(st.nextToken());
		Arrays.sort(stu, Collections.reverseOrder());
		System.out.println(stu[k-1]);
	}
}
