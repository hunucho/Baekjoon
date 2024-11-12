package bronze;

import java.util.*;

public class Main_B4_4589 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int [] arr = new int [3];
		System.out.println("Gnomes:");
		for(;N>0;N--) {
			for(int i=0;i<3;i++)
				arr[i]=sc.nextInt();
			System.out.println((arr[0]>arr[1]&&arr[1]>arr[2]) || arr[0]<arr[1] && arr[1]<arr[2]?"Ordered":"Unordered");
		}
	}
}
