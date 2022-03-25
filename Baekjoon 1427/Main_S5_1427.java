package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_S5_1427 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		char [] a=s.toCharArray();
		Arrays.sort(a);
		for(int i=a.length-1;i>=0;i--)
			System.out.print(a[i]);
	}
}
