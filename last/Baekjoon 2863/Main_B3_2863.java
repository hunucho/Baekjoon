package bronze;

import java.util.*;

public class Main_B3_2863 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a=sc.nextDouble(), b=sc.nextDouble(), c=sc.nextDouble(), d=sc.nextDouble(), max=-1, tmp=0;
		int ans=0;
		tmp = a/c+b/d;
		if(tmp>max) {
			max=tmp;
			ans=0;
		}			
		tmp = c/d+a/b;
		if(tmp>max) {
			max=tmp;
			ans=1;
		}
		tmp = d/b+c/a;
		if(tmp>max) {
			max=tmp;
			ans=2;
		}			
		tmp =b/a+d/c;
		if(tmp>max) {
			max=tmp;
			ans=3;
		}
		System.out.println(ans);
	}
}
