import java.io.*;
import java.math.*;

public class Main_B3_2547 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			br.readLine();
			String ans="NO";
			int n=Integer.parseInt(br.readLine());
			BigInteger sum= new BigInteger("0");
			for(int j=0;j<n;j++)
				sum=sum.add(new BigInteger(br.readLine()));
			if(sum.mod(new BigInteger(String.valueOf(n)))==BigInteger.ZERO)
				ans="YES";
			System.out.println(ans);
		}		
	}
}
  
