package bronze;

import java.util.*;

public class Main_B3_2523 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++)
				sb.append("*");
			sb.append("\n");
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=0;j<i;j++)
				sb.append("*");
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
