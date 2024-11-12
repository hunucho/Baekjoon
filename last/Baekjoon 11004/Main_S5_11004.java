package silver;

import java.io.*;
import java.util.*;

public class Main_S5_11004 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()), k=Integer.parseInt(st.nextToken());
		int [] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		Arrays.sort(arr);	// 정렬후
		System.out.println(arr[k-1]); // K번째 숫자 출력
	}
}