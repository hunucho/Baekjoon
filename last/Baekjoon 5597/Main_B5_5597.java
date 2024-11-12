package bronze;

import java.util.*;

public class Main_B5_5597 {
	public static void main(String[] args) {
		boolean [] chk = new boolean [31];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<28;i++)
			chk[sc.nextInt()]=true;
		for(int i=1;i<=30;i++)
			if(!chk[i])
				System.out.println(i);		
	}
}
