package bronze;

import java.util.*;

public class Main_B2_2587 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		int avg =0;
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
			avg+=arr[i];
		}
		Arrays.sort(arr);
		System.out.println(avg/5+"\n"+arr[2]);
	}
}
