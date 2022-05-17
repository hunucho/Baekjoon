package silver;

import java.io.*;
import java.util.*;

public class Main_S2_6603 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int [] picked = new int[6], S;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int k=Integer.parseInt(st.nextToken());
			if(k==0) {
				bw.close();
				break;
			}
			S = new int[k]; 
			for(int i=0;i<k;i++) {
				S[i]=Integer.parseInt(st.nextToken());
			}
			combi(0,k,0);
			bw.write("\n");
		}
	}
	static public void combi(int start,int size,int depth) throws Exception{
		if(depth==6) {
			for(int i=0;i<6;i++)
				bw.write(picked[i]+" ");
			bw.write("\n");
			return;
		}
		for(int i=start;i<size;i++) {
			picked[depth]=S[i];
			combi(i+1,size,depth+1);
		}
	}
}
