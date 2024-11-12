package bronze;

import java.util.*;

public class Main_B3_10833 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), ans=0;
		for(int i=0;i<n;i++) {
			int st=sc.nextInt(), ap=sc.nextInt();
			ans+=ap%st;
		}
		System.out.println(ans);
	}
}
