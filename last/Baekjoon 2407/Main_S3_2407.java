package silver;

import java.math.BigInteger;
import java.util.Scanner;

public class Main_S3_2407 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), m=sc.nextInt();
		BigInteger up = new BigInteger("1"), down = new BigInteger("1");
		if(n-m<m)
			m=n-m;
		for(int i=0;i<m;i++) {
			up=up.multiply(new BigInteger(String.valueOf(n-i)));
			down=down.multiply(new BigInteger(String.valueOf(i+1)));
		}
		System.out.println(up.divide(down));
		
	}
	
}
