package bronze;

import java.util.*;

public class Main_B4_2752 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a=new int[3];
		int i;
		for(i=0;i<3;i++)
		a[i]=sc.nextInt();
		Arrays.sort(a);
		for(i=0;i<3;i++)
			System.out.print(a[i]+" ");
	}
}
