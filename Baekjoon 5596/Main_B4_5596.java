package bronze;

import java.util.*;

public class Main_B4_5596 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s=0, t=0;
		for(int i=0;i<4;i++)
			s+=sc.nextInt();
		for(int i=0;i<4;i++)
			t+=sc.nextInt();
		System.out.println(Math.max(s, t));
	}
}
