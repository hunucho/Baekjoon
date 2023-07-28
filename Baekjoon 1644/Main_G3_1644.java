import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), ans=0;
		boolean [] chkPrime = new boolean [N+1];
		int [] prime = new int [N+2];
		Arrays.fill(chkPrime,true);
		for(int i=2;i<=N;i++)
			for(int j=i+i;j<=N;j+=i)
				chkPrime[j]=false;
		
		int k=0;
		for(int i=2;i<=N;i++)
			if(chkPrime[i])
				prime[k++]=i;
		int i=0, j=0, tmp=2;
		while(i<=j && prime[j]>0) {
			if(tmp==N) {
				ans++;
				tmp+=prime[++j];
			}
			else if(tmp>N)
				tmp-=prime[i++];
			else
				tmp+=prime[++j];
		}
		System.out.println(ans);
	}
}
