package silver;

import java.io.*;
import java.util.*;

public class Main_S5_11931 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		Integer [] arr = new Integer [n];
		for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(br.readLine());
		Arrays.sort(arr,Collections.reverseOrder());
		for(int i=0;i<n;i++)
			bw.append(arr[i]+"\n");
		bw.close();
	}
}
