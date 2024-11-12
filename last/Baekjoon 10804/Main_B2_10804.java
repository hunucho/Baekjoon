package bronze;

import java.util.*;

public class Main_B2_10804 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [21];
		for(int i=1;i<21;i++)
			arr[i]=i;
		for(int i=0;i<10;i++) {
			int a=sc.nextInt(), b=sc.nextInt();
			for(int j=0;j<=(b-a)/2;j++) {
				int tmp=arr[a+j];
				arr[a+j]=arr[b-j];
				arr[b-j]=tmp;
			}
		}
		for(int i=1;i<21;i++)
			System.out.print(arr[i]+" ");
	}
}
