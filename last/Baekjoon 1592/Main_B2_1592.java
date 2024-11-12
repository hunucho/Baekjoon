package bronze;

import java.util.Scanner;

public class Main_B2_1592 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), m=sc.nextInt(), l=sc.nextInt(), cnt=0, pos=1;
		int [] ppl = new int[n];
		while(true) {
			ppl[pos]++;
			if(ppl[pos]==m)
				break;
			cnt++;
			if(ppl[pos]%2==1)
				pos=(pos+l)%n;
			else if(ppl[pos]%2==0)
				pos=(n+pos-l)%n;
		}
		System.out.println(cnt);
	}
}
