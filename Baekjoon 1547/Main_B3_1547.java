package bronze;

import java.util.Scanner;

public class Main_B3_1547 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] S=new int[] {0,1,2,3};
		int m=sc.nextInt();
		for(int i=0;i<m;i++) {
			int a=sc.nextInt(), b=sc.nextInt(), t=S[a];
			S[a]=S[b];
			S[b]=t;
		}
		for(int i=1;i<4;i++)
			if(S[i]==1)
				System.out.println(i);
	}
}
