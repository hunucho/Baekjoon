package bronze;

import java.util.*;

public class Main_B3_4101 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a=sc.nextInt(), b=sc.nextInt();
			if(a==0 && b==0)
				break;
			if(a>b)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
