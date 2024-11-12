package bronze;

import java.util.*;

public class Main_B1_2947 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++)
			arr[i] = sc.nextInt();
		while (true) {
			int cnt = 0;
			for (int k = 0; k < 4; k++)
				if (arr[k] < arr[k + 1])
					cnt++;
			if (cnt == 4)
				break;
			for (int i = 0; i < 4; i++) {
				if (arr[i] > arr[i+1]) {
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
					for (int k = 0; k < 5; k++)
						System.out.print(arr[k] + " ");
					System.out.println();
				}
			}
		}
	}
}
