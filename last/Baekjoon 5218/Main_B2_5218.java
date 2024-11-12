package bronze;

import java.util.*;

public class Main_B2_5218 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0;t<T;t++) {
			String X=sc.next(), Y=sc.next(), ans="Distances: ";
			for(int i=0;i<X.length();i++) {
				char x = X.charAt(i), y=Y.charAt(i);
				if(x>y)
					ans+=(y+26-x)+" ";
				else
					ans+=(y-x)+" ";
			}
			System.out.println(ans);
		}
	}
}
