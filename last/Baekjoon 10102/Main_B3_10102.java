package bronze;

import java.util.*;

public class Main_B3_10102 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V=sc.nextInt();
		sc.nextLine();
		String str=sc.nextLine();
		int A=str.length()-str.replaceAll("A", "").length(), B=V-A;
		System.out.println(A>B?'A':A<B?'B':"Tie");
		
	}
}
