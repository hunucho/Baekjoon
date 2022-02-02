package silver;

import java.util.Scanner;

public class Main_S3_2559 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt();
		int [] arr=new int[n];		
		int max=Integer.MIN_VALUE,sum=0;
		for(int i=0;i<k;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		if(sum>max)
			max=sum;
		for(int i=0;i<n-k;i++) {
			sum-=arr[i];
			arr[i+k]=sc.nextInt();			
			sum+=arr[i+k];
			if(sum>max)
				max=sum;
		}
		sc.close();
		System.out.println(max);
	}

}
