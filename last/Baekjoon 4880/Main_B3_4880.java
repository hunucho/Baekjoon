package bronze;

import java.io.*;
import java.util.*;

public class Main_B3_4880 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken()), b=Integer.parseInt(st.nextToken()), c=Integer.parseInt(st.nextToken());
			if(a==0 && b==0 && c==0)
				break;
			if(b-a==c-b)
				bw.write("AP "+(c+c-b)+"\n");
			else
				bw.write("GP "+(c*(c/b))+"\n");
		}
		bw.close();
	}	
}
