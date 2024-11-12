package bronze;

import java.util.*;

public class Main_B4_13136 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long r=sc.nextLong(), c=sc.nextLong(), n=sc.nextLong();
		long rr=r/n+(r%n>0?1:0), cc=c/n+(c%n>0?1:0);
		System.out.println(rr*cc);		
	}
}
