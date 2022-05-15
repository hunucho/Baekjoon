package bronze;

import java.util.*;

public class Main_B1_1145 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] in = new int [5];
		for(int i=0;i<5;i++)
			in[i]=sc.nextInt();
		for(int i=1;i<1000000;i++) {
			int cnt=0;
			for(int j=0;j<5;j++) {
				if(i%in[j]==0)
					cnt++;
			}
			if(cnt>=3) {
				System.out.println(i);
				break;
			}
		}
			
	}
}
