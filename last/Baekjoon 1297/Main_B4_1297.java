package bronze;

import java.util.*;

public class Main_B4_1297 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d=sc.nextDouble(), h=sc.nextDouble(), w=sc.nextDouble();
		double x = Math.sqrt(d*d/(w*w+h*h));
		System.out.println((int)(x*h)+" "+(int)(x*w));
	}
}
