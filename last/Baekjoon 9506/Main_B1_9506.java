package bronze;

import java.util.*;

public class Main_B1_9506 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		while((n=sc.nextInt())!=-1) {
			StringBuilder sb = new StringBuilder();
			int t=0;
			for(int i=1;i<n;i++)
				if(n%i==0) {
					t+=i;
					sb.append(i+" + ");
				}
			sb.setLength(sb.length()-2);
			if(t==n)
				System.out.println(n+" = "+sb.toString());
			else
				System.out.println(n+" is NOT perfect.");
		}
	}
}
