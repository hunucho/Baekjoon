package bronze;

import java.util.*;

public class Main_B3_2857 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean chk=false;
		for(int i=1;i<=5;i++) {
			String str = sc.next();
			if(str.contains("FBI")) {
				System.out.print(i+" ");
				chk=true;
			}
		}
		if(!chk)
			System.out.println("HE GOT AWAY!");
	}
}
