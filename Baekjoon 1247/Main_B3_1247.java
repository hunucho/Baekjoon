package bronze;

import java.io.*;
import java.math.BigInteger;

public class Main_B3_1247 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<3;i++) {
			int n=Integer.parseInt(br.readLine());
			BigInteger a=new BigInteger("0");
			for(int j=0;j<n;j++)
				a=a.add(new BigInteger(br.readLine()));
			int t = a.compareTo(BigInteger.ZERO);
			System.out.println(t==0?"0": t>0?"+":"-");
		}
	}
}
