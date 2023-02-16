package bronze;

import java.util.*;

public class Main_B3_9610 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), q1=0, q2=0, q3=0, q4=0, ax=0;
		for(int i=0;i<n;i++) {
			int x=sc.nextInt(), y=sc.nextInt();
			if(x>0&&y>0)
				q1++;
			else if(x<0&&y>0)
				q2++;
			else if(x<0&&y<0)
				q3++;
			else if(x>0&&y<0)
				q4++;
			else
				ax++;
		}
		System.out.printf("Q1: %d\nQ2: %d\nQ3 : %d\nQ4 : %d\nAXIS : %d",q1,q2,q3,q4,ax);
	}
}
