package bronze;

import java.util.*;

public class Main_B2_5585 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n=1000-sc.nextInt(),ans=0,i=0;
		int [] c = new int [] {500,100,50,10,5,1};
		while(n>0) {
			ans+=n/c[i];
			n%=c[i++];
		}
		System.out.println(ans);
	}
}
