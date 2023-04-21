package bronze;

import java.util.*;

public class Main_B3_27960 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt(), ans=0;
		boolean [] scores = new boolean [10];
		for(int i=9;i>=0;i--) {
			int tmp=(int) Math.pow(2, i);
			if(tmp<=a) {
				scores[i]=!scores[i];
				a-=tmp;
			}
			if(tmp<=b) {
				scores[i]=!scores[i];
				b-=tmp;
			}			
		}
		for(int i=0;i<10;i++)
			if(scores[i])
				ans+=Math.pow(2, i);
		System.out.println(ans);
	}
}
