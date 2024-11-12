package bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Main_B2_2309 {
	static boolean[] isChecked = new boolean[9];
	static boolean chk=false;
	static int[] arr = new int[9];
	static int sum = 0;

	public static void combination(int start,int n) {
		if (n == 7) {
			if (sum == 100) {
				for (int i = 0; i < 9; i++)
					if (isChecked[i])
						System.out.println(arr[i]);
				chk=true;
				return;
			}
		}
		for (int i = start; i < 9; i++) {
			if (isChecked[i]==false) {
				sum += arr[i];
				isChecked[i] = true;
				combination(i+1, n + 1);
				if(chk)
					return;
				sum -= arr[i];
				isChecked[i] = false;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 9; i++)
			arr[i] = sc.nextInt();
		Arrays.sort(arr);
		combination(0,0);
	}
}
