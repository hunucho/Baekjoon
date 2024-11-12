package bronze;

import java.util.*;

public class Main_B4_13866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [4];
		for(int i=0;i<4;i++)
			arr[i]=sc.nextInt();
		System.out.println(Math.abs(arr[3]-arr[2]-arr[1]+arr[0]));
	}
}
