package silver;

import java.util.*;

public class Main_S3_1072 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x=sc.nextLong(), y=sc.nextLong(), z=y*100/x, t=0, min=0, max=Integer.MAX_VALUE;
		while(min<max) {
			long avg=(min+max)/2;
			if((y+avg)*100/(x+avg)>=z+1)
				max=avg;
			else
				min=avg+1;
		}
		System.out.println(max==Integer.MAX_VALUE?-1:max);		
	}
}
