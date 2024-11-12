package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_S5_2609 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] a = new int [2];
		int[][] b = new int [2][10000];
		int temp=2;
		for(int i=0;i<2;i++) {
			a[i] = Integer.parseInt(st.nextToken());
			temp=2;
			while(a[i]>1 && temp<=a[i]) {
				if(a[i]%temp==0) {
					b[i][temp]++;
					a[i]/=temp;
				}
				else
					temp++;
			}
		}
		int gcd=1, lcm=1;
		for(int i=0;i<10000;i++)
			if(Math.min(b[0][i], b[1][i])!=0)
				gcd*=Math.pow(i, Math.min(b[0][i], b[1][i]));
		
		for(int i=0;i<10000;i++)
			if(Math.max(b[0][i], b[1][i])!=0)
				lcm*=Math.pow(i,Math.max(b[0][i], b[1][i]));
		
		System.out.println(gcd);
		System.out.println(lcm);
		
			
	}

}
