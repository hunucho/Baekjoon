import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken()), K=Integer.parseInt(st.nextToken()), ans=0;
		st = new StringTokenizer(br.readLine());
		int [] A = new int [N];
		for(int i=0;i<N;i++)
			A[i] = Integer.parseInt(st.nextToken());
		for(int i=0;i<N-1;i++) {
			if(A[i]>=A[i+1]) {
				A[i+1]+=K;
				if(A[i]>=A[i+1]) {
					ans=-1;
					break;
				}
				ans++;
			}			
		}
		System.out.println(ans);
	}
}
