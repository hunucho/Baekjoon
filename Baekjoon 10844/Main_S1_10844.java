package silver;

import java.util.*;

public class Main_S1_10844 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),ans=0;
		int[] num=new int[10], temp;
		
		for(int i=1;i<=9;i++)
			num[i]=1;
		
		for(int k=1;k<n;k++) {
			temp = new int[10];
			for(int i=0;i<=9;i++) {
				if(i-1>=0)
					temp[i-1]+=num[i];
				if(i+1<=9)
					temp[i+1]+=num[i];
			}
			for(int i=0;i<=9;i++) {
				num[i]=temp[i]%1000000000;
			}
		}
		for(int i=0;i<10;i++)
			ans=(ans+num[i])%1000000000;
		System.out.println(ans);
	}
}
