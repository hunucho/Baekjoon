package bronze;

import java.util.*;

public class Main_B3_5063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		for(int n=0;n<N;n++) {
			String ans="";
			int r=sc.nextInt(), e=sc.nextInt(), c=sc.nextInt();
			if(r<e-c)
				ans="advertise";
			else if(r>e-c)
				ans="do not advertise";
			else
				ans="does not matter";
			System.out.println(ans);
		}
	}
}
