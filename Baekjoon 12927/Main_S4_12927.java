package silver;

import java.util.Scanner;

public class Main_S4_12927 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		boolean [] sw = new boolean[str.length()+1];
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)=='Y')
				sw[i+1]=true;
		int cnt=0;
		for(int i=1;i<=str.length();i++) {
			if(sw[i]) {
				cnt++;
				for(int j=i;j<=str.length();j+=i)
					sw[j]=!sw[j];
			}
		}
		for(int i=1;i<=str.length();i++)
			if(sw[i]) {
				System.out.println("-1");
				return;
			}
		System.out.println(cnt);
	}
}
