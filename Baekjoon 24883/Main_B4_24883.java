package bronze;

import java.util.Scanner;

public class Main_B4_24883 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(str.equals("n")||str.equals("N"))
			System.out.println("Naver D2");
		else
			System.out.println("Naver Whale");
	}
}
