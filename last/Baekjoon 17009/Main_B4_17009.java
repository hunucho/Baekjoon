package bronze;

import java.util.*;

public class Main_B4_17009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt()*3+sc.nextInt()*2+sc.nextInt();
		int b=sc.nextInt()*3+sc.nextInt()*2+sc.nextInt();
		System.out.println(a==b?"T":a>b?"A":"B");
	}
}
