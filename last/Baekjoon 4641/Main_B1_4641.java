package bronze;

import java.io.*;
import java.util.*;

public class Main_B1_4641 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			boolean [] arr = new boolean[101];
			int temp=Integer.parseInt(st.nextToken()), cnt=0;
			if(temp==-1)
				break;
			while(st.hasMoreTokens()) {
				arr[temp]=true;
				temp=Integer.parseInt(st.nextToken());
			}
			for(int i=1;i<=50;i++)
				if(arr[i] &&arr[i*2])
					cnt++;
			bw.write(cnt+"\n");
		}
		bw.close();
	}
}
