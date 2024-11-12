package bronze;

import java.util.*;

public class Main_B4_4714 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			double f=sc.nextDouble();
			if(f<0)
				break;
			System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n",f, f/5.9880239520958083832335329341317);
		}
	}
}
