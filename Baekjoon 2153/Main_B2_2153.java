package bronze;

import java.io.*;

public class Main_B2_2153 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int sum=0;
		boolean isPrime=true;
		for(int i=0;i<str.length();i++) {
			if(Character.isLowerCase(str.charAt(i)))
				sum+=str.charAt(i)-'a'+1;
			else
				sum+=str.charAt(i)-'A'+27;
		}
		for(int i=2;i<=Math.sqrt(sum);i++)
			if(sum%i==0)
				isPrime=false;
		if(isPrime)
			System.out.println("It is a prime word.");
		else
			System.out.println("It is not a prime word.");
	}
}
