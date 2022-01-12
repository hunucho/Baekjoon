package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_S5_2751 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n= Integer.parseInt(br.readLine()), pmin=Integer.MAX_VALUE, pmax=Integer.MIN_VALUE, mmin=Integer.MAX_VALUE, mmax=Integer.MIN_VALUE;
		int[] parr=new int[1000005];
		int[] marr=new int[1000005];
		for(int i=0;i<n;i++) {
			int temp=Integer.parseInt(br.readLine());
			if(temp>-1) {
				parr[temp]++;
				if(temp>pmax)
					pmax=temp;
				if(temp<pmin)
					pmin=temp;
			}
			else {
				marr[temp*-1]++;
				if(temp>mmax)
					mmax=temp;
				if(temp<mmin)
					mmin=temp;
			}
		}
		for(int i=-mmin;i>=-mmax;i--)
			if(marr[i]!=0)
				bw.write("-"+i+"\n");
		for(int i=pmin;i<=pmax;i++)
			if(parr[i]!=0)
				bw.write(i+"\n");
		
		bw.flush();
		bw.close();
	}


}
