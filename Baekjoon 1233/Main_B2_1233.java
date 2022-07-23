package bronze;

import java.util.*;

public class Main_B2_1233 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1=sc.nextInt(), s2=sc.nextInt(), s3=sc.nextInt();
		int [] arr = new int [101];
		for(int i=1;i<=s1;i++)
			for(int j=1;j<=s2;j++)
				for(int k=1;k<=s3;k++)
					arr[i+j+k]++;
		int ans=0, cnt=0;
		for(int i=0;i<=100;i++)
			if(cnt<arr[i]) {
				cnt=arr[i];
				ans=i;
			}
		System.out.println(ans);
	}
}
