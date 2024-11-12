import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), M=sc.nextInt();
		int [] arr = new int [N];
		int l=1, r=1000000000;
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
			l=Math.max(l, arr[i]);
		}
		while(l<r) {
			int cnt=1, tmp=0;
			int m=(l+r)/2;
			for(int i=0;i<N;i++) {
				tmp+=arr[i];
				if(tmp>m) {
					cnt++;
					tmp=arr[i];
				} 
			}
			if(cnt<=M)
				r=m;
			else
				l=m+1;
		}
		System.out.println(l);
	}	
}
