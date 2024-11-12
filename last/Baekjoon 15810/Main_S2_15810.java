import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		long M=sc.nextLong();
		int [] A = new int [N];
		for(int i=0;i<N;i++)
			A[i]=sc.nextInt();
		long l=1, r=(long)Math.pow(10,  12);
		
		while(l<r) {
			long m=(l+r)/2, tmp=0;
			for(int i=0;i<N;i++) {
				tmp+=m/A[i];
			}
			
			if(tmp>=M)
				r=m;
			else
				l=m+1;
			
//			System.out.printf("%d %d %d %d\n", l, r, m, tmp);
			
		}
		System.out.println(r);
		
	}
}
