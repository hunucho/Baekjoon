import java.io.*;
import java.util.*;

public class Main_B2_27335 {
	public static void main(String[] args) throws Exception{		
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N=Integer.parseInt(br.readLine()), max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
		int [] arr = new int [N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			max=Math.max(max, arr[i]);
			min=Math.min(min, arr[i]);
		}
		for(int i=0;i<N;i++)
			sb.append(Math.max(Math.abs(max-arr[i]), Math.abs(min-arr[i]))+"\n");
		System.out.println(sb.toString());		
	}
}
	
