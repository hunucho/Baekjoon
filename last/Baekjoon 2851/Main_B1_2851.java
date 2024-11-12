package bronze;

import java.util.Scanner;

public class Main_B1_2851 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] mush = new int[11];
		for(int i=0;i<10;i++)
			mush[i]=sc.nextInt();
		int sum=0,i;
		for(i=0;i<10;i++) {
			sum+=mush[i];
			if(Math.abs(100-sum)<Math.abs(100-sum-mush[i+1]))
				break;
		}
		System.out.println(sum);
	}
}
