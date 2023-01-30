package bronze;

import java.util.Scanner;

public class Main_B5_3003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [] {1, 1, 2, 2, 2, 8};
		for(int i=0;i<6;i++) {
			System.out.println(arr[i]-sc.nextInt());
		}
	}
}
