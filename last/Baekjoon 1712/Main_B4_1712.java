package bronze;

import java.util.Scanner;

public class Main_B4_1712 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int arr[]=new int [3], sum=0;
		for(int i=0;i<3;i++)
			arr[i]=sc.nextInt();
		System.out.println((arr[2]-arr[1])>0?arr[0]/(arr[2]-arr[1])+1:-1);
	}

}
