import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		Stack<Integer> stck = new Stack<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int [] arr = new int [N];
		for(int i=0;i<N;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		for(int i=0;i<N;i++) {
			if(stck.isEmpty())
				stck.add(i);
			else {
				while(!stck.isEmpty() && arr[stck.peek()]<arr[i])
					arr[stck.pop()]=arr[i];
				stck.add(i);				
			}
		}
		while(!stck.isEmpty())
			arr[stck.pop()]=-1;
		for(int i=0;i<N;i++)
			sb.append(arr[i]+" ");
		System.out.println(sb.toString());
	}
}
