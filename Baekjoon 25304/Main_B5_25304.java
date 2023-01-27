package bronze;

import java.util.*;

public class Main_B5_25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt(), n=sc.nextInt(), s=0;
		String ans="No";
		for(int i=0;i<n;i++) {
			s+=sc.nextInt()*sc.nextInt();
		}
		if(s==x)
			ans="Yes";
		System.out.println(ans);
	}
}
