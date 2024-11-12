package bronze;

import java.util.*;

public class Main_B3_16479 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double K=sc.nextDouble(), D1=sc.nextDouble(), D2=sc.nextDouble();
		System.out.printf("%f",Math.pow(K, 2)-
				(double)Math.pow( ( Math.max(D1, D2) - Math.min(D1, D2) )/2 ,2));
	}
}
