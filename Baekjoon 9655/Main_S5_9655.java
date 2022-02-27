package silver;

import java.util.Scanner;

public class Main_S5_9655 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String str="SK";
		if(n%2==1)
			str="CY";
		System.out.println(str);
	}
}
