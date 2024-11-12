package silver;

import java.util.Scanner;

public class Main_S3_10974 {
	static boolean checked[] = new boolean[10];
	static int n, m;
	static char [] res= new char[10];
	public static void f(int m) {
		if(m==n) {
			for(int i=0;i<n;i++)
				System.out.print(res[i]+" ");
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			if(!checked[i])
			{
				checked[i]=!checked[i];
				res[m]=(char)(i+'0');
				f(m+1);				
				checked[i]=!checked[i];		
			}
		}		
	}
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		f(0);			
	}
}
