package bronze;

import java.util.*;

public class Main_B4_19944 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		System.out.println(m<=2?"NEWBIE!":m<=n?"OLDBIE!":"TLE!");
	}
}
