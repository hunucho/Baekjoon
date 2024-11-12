package silver;

import java.util.Scanner;

public class Main_S4_17626 {
	static int len=4;
	public static void find(int n,int depth) {
		if(depth>=len)
			return;
		for(int i=(int)Math.sqrt(n);i>=1;i--) {
			if(n-i*i<=0) {
				len=depth;
				return;
			}
			find(n-i*i,depth+1);			
		}
	}
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		find(n,1);
		System.out.println(len);
	}
}
