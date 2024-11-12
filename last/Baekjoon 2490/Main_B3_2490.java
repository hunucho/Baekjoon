package bronze;

import java.util.Scanner;

public class Main_B3_2490 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			int cnt=4;
			char ans;
			for(int j=0;j<4;j++)
				cnt-=sc.nextInt();
			if(cnt==0)
				ans='E';
			else
				ans=(char)(cnt-1+'A');
			System.out.println(ans);
		}
			
	}
}
