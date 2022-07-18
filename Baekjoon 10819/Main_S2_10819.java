import java.io.*;
import java.util.*;

public class Main_S2_10819 {
	static int n, ans=Integer.MIN_VALUE;
	static int [] a, b;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		a = new int [n];
		b= new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			a[i]=Integer.parseInt(st.nextToken());
			b[i]=-1;
		}
		permu(0);
		System.out.println(ans);
	}
	public static void permu(int depth) {
		if(depth==n) {
			int temp=0;
			for(int i=0;i<n-1;i++)
				temp+=Math.abs(a[b[i]]-a[b[i+1]]);
			if(temp>ans)
				ans=temp;
			return;
		}
		for(int i=0;i<n;i++) {
			if(b[i]==-1) {
				b[i]=depth;
				permu(depth+1);
				b[i]=-1;
			}
		}
	}
}
