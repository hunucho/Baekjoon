package bronze;

import java.util.Scanner;

public class Main_B2_1159 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), c=0;
		int [] arr = new int[26];
		for(int i=0;i<n;i++) {
			String t = sc.next();
			arr[t.charAt(0)-'a']++;
		}
		for(int i=0;i<26;i++)
			if(arr[i]>=5) {
				System.out.print((char)(i+'a'));
				c++;
			}
		if(c==0)
			System.out.println("PREDAJA");
	}
}
