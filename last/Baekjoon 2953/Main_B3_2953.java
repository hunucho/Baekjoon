package bronze;

import java.util.*;
import java.io.*;

public class Main_B3_2953 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ans=0, max=0;
		for(int i=0;i<5;i++) {
			int tmp=0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<4;j++)
				tmp+=Integer.parseInt(st.nextToken());
			if(max<tmp) {
				max=tmp;
				ans=i+1;
			}
		}
		System.out.println(ans+" "+max);
	}
}
