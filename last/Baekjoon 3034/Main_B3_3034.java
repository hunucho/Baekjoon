package bronze;

import java.util.*;

public class Main_B3_3034 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), w=sc.nextInt(), h=sc.nextInt();
		double x=Math.pow(w*w+h*h,0.5);
		for(int i=0;i<n;i++)
			System.out.println(sc.nextDouble()>x?"NE":"DA");
	}
}
