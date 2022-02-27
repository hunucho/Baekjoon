package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B1_3985 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine()), n = Integer.parseInt(br.readLine()), max=-1, exp=-1, maxi=0, expi=0;
		boolean[] bread = new boolean[l+1];
		int[]cnt=new int [n+1];
		for(int i=1;i<=n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
			if(k-p+1>exp) {
				exp=k-p+1;
				expi=i;
			}
			for(int j=p;j<=k;j++) {
				if(!bread[j]) {
					bread[j]=true;
					cnt[i]++;
				}
			}
			if(max<cnt[i]) {
				max=cnt[i];
				maxi=i;
			}				
		}
		System.out.println(expi);
		System.out.println(maxi);
	}
}
