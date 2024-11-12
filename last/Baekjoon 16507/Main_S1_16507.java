import java.io.*;
import java.util.*;

public class Main_S1_16507 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R=Integer.parseInt(st.nextToken()), C=Integer.parseInt(st.nextToken()), Q=Integer.parseInt(st.nextToken());
		int [][] info = new int [R+1][C+1], sum=new int[R+1][C+1];
		for(int i=1;i<=R;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1;j<=C;j++) {
				info[i][j]=Integer.parseInt(st.nextToken());
				sum[i][j]=sum[i][j-1]+info[i][j];
			}
		}
		for(int k=0;k<Q;k++) {
			st = new StringTokenizer(br.readLine());
			int r1=Integer.parseInt(st.nextToken()), c1=Integer.parseInt(st.nextToken()), r2=Integer.parseInt(st.nextToken()), c2=Integer.parseInt(st.nextToken());
			int ans=0, size=(r2-r1+1)*(c2-c1+1);
			for(int i=r1;i<=r2;i++)
				ans+=sum[i][c2]-sum[i][c1-1];
			sb.append(ans/size+"\n");
		}	
		System.out.println(sb.toString());
	}
}
