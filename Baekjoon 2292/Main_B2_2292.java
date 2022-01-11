package Bronze;

import java.util.Scanner;

public class Main_B2_2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max=1, d=6,ans=1;
		// group 1 = 1
		// group 2 = 2-7	7-1=6
		// group 3 = 8-19	19-7=12		12-6=6
		// group 4 = 20-37	37-19=18	18-12=6
		for(int i=0;i<n;i++) {
			if(max>=n) {
				break;
			}
			max+=d;		// each group difference is increasing
			d+=6;		// each step arithmetic sequence is increased 6
			ans++;		// count each step
		}
		System.out.println(ans);
	}

}
