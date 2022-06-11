package silver;

import java.util.*;

public class Main_S5_2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt(), n=sc.nextInt();
		boolean[] isNotPrime=new boolean[n+1];
		isNotPrime[1]=true;
		for(int i=2;i<=Math.sqrt(n);i++)
			for(int j=2;i*j<=n;j++)
				isNotPrime[i*j]=true;
		int min=Integer.MAX_VALUE, sum=0;
		for(int i=m;i<=n;i++)
			if(!isNotPrime[i]) {
				if(min>i)
					min=i;
				sum+=i;
			}
		if(sum==0)
			System.out.println(-1);
		else
			System.out.println(sum+"\n"+min);
	}
}
