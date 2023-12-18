import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		long M=sc.nextLong();
		long [] T = new long [N];
		long l=1;
		long r=Long.MAX_VALUE/2;
		for(int i=0;i<N;i++)
			T[i]=sc.nextInt();
		while(l<r) {
			long pass=0;
			long m=(l+r)/2;
			for(int i=0;i<N;i++) {
				pass+=m/T[i];
				if(pass>=M || pass<0)
					break;
			}
			if(pass>=M)
				r=m;
			else
				l=m+1;
		}
		System.out.println(r);
	}	
}
