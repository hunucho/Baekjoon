package bronze;

import java.util.*;

public class Main_B2_20528 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), ans=1;
		String [] S = new String [N];
		for(int i=0;i<N;i++)
			S[i]=sc.next();
		for(int i=0;i<N-1;i++)
			if(S[i].charAt(S[i].length()-1)!=S[i+1].charAt(0))
				ans=0;
		System.out.println(ans);
	}
}
