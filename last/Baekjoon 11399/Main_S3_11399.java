package silver;

import java.util.Arrays;
import java.util.Scanner;

public class Main_S3_11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),sum=0;
		int [] arr = new int[n], p=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++)
				p[j]=p[j]+arr[i];
		}
		for(int i=0;i<n;i++)
			sum+=p[i];
		System.out.println(sum);

	}

}
