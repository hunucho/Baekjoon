import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine()), sum=0;
		int [][] arr = new int [N][N];
		int [] cnt = new int [N*N+1];
		boolean ans=true;
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
				cnt[arr[i][j]]++;
			}
		}
		for(int i=0;i<N;i++) {
			int tmp=0;
			for(int j=0;j<N;j++)
				tmp+=arr[i][j];
			if(sum==0)
				sum=tmp;
			else if(sum>0 && sum!=tmp)
				ans=false;
		}
		for(int j=0;j<N;j++) {
			int tmp=0;
			for(int i=0;i<N;i++)
				tmp+=arr[i][j];
			if(sum!=tmp)
				ans=false;
		}
		int tmp=0;
		for(int i=0;i<N;i++)
			tmp+=arr[i][i];
		if(sum!=tmp)
			ans=false;
		tmp=0;
		for(int i=0;i<N;i++)
			tmp+=arr[i][N-i-1];
		if(sum!=tmp)
			ans=false;
		for(int i=1;i<=N*N;i++)
			if(cnt[i]!=1)
				ans=false;
		System.out.println(ans?"TRUE":"FALSE");
		
	}
}
