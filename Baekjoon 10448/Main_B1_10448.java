package bronze;

import java.util.*;

public class Main_B1_10448 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int [] arr = new int [51];
		for(int i=1, t=1;i<=50;i++, t+=i)
			arr[i]=t;
		for(int i=0;i<N;i++) {
			int K=sc.nextInt(), ans=0;
			for(int x=1;x<=50;x++) {
				for(int y=1;y<=50;y++) {
					for(int z=1;z<=50;z++) {
						int tmp=arr[x]+arr[y]+arr[z];
						if(tmp>K)
							break;
						if(tmp==K)
							ans=1;
					}
				}
			}
			System.out.println(ans);
		}		
	}
}
