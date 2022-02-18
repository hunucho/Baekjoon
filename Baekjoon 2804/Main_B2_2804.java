package bronze;

import java.util.Scanner;

public class Main_B2_2804 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1=sc.next(), s2=sc.next();
		int posi=0, posj=0;
		char [][] print=new char[s2.length()][s1.length()];
		for(int i=0;i<s1.length();i++) {
			if(s2.contains(s1.substring(i,i+1))) {
				posi=s2.indexOf(s1.charAt(i));
				posj=i;
				break;
			}
		}
		for(int j=0;j<s1.length();j++)
			print[posi][j]=s1.charAt(j);
		for(int i=0;i<s2.length();i++)
			print[i][posj]=s2.charAt(i);
		for(int i=0;i<s2.length();i++) {
			for(int j=0;j<s1.length();j++) {
				if(print[i][j]==0)
					System.out.print('.');
				else
					System.out.print(print[i][j]);
			}
			System.out.println();
		}
	}
}
