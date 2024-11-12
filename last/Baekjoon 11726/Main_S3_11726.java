package silver;

import java.util.Scanner;

public class Main_S3_11726 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=0, b=1,c=0;
		for(int i=1;i<=n;i++) {
			c=a+b;
			a=b%10007;
			b=c%10007;
		}
		System.out.println(c%10007);
	}
}
