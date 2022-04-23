package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_S5_1475 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int [] a= new int[10];
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='6' || str.charAt(i)=='9')
				a[6]++;
			else
				a[str.charAt(i)-'0']++;
		}
		a[6]=a[6]/2+a[6]%2;
		int ans=0;
		for(int i=0;i<10;i++)
			ans=Math.max(ans, a[i]);
		System.out.println(ans);
	}
}
