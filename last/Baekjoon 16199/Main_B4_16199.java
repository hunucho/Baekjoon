package bronze;

import java.util.*;

public class Main_B4_16199 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y1=sc.nextInt(), m1=sc.nextInt(), d1=sc.nextInt(), y2=sc.nextInt(), m2=sc.nextInt(), d2=sc.nextInt();
		System.out.println(((m2>=m1)||(m2>=m1&&d2>=d1)?y2-y1:y2-y1-1)+"\n"+(y2-y1+1)+"\n"+(y2-y1));		
	}
}
