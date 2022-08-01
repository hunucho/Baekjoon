package bronze;

import java.util.*;

public class Main_B2_2948 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt(), m=sc.nextInt(), ans=0;
		int [] days = new int[] {0,0,31,28,31,30,31,30,31,31,30,31,30,31};
		String [] day = { "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};
		for(int i=0;i<=m;i++)
			ans+=days[i];
		ans+=d;
		System.out.println(day[ans%7]);
	}
}
