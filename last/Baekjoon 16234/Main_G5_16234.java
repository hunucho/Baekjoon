package gold;

import java.io.*;
import java.util.*;

public class Main_G5_16234 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()), l=Integer.parseInt(st.nextToken()), r=Integer.parseInt(st.nextToken());
		int ans=0;
		int [][] arr = new int [n+2][n+2];
		Arrays.fill(arr[0], -1);
		Arrays.fill(arr[n+1], -1);
		for(int i=1;i<=n;i++) {
			Arrays.fill(arr[i], -1);
			st = new StringTokenizer(br.readLine());
			for(int j=1;j<=n;j++)
				arr[i][j]=Integer.parseInt(st.nextToken());
		}
		int [] dx = {1,-1,0,0}, dy = {0,0,1,-1};
		while(true) {
			boolean used=false;
			boolean [][] brr = new boolean [n+2][n+2];
			Queue<int[]> q = new LinkedList<int[]>(), save=new LinkedList<int[]>();
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					int temp=arr[i][j], cnt=1;
					if(!brr[i][j]) {
						brr[i][j]=true;
						q.add(new int[]{i,j});
						
						while(q.size()>0) {
							int []cur=q.poll();
							save.add(cur);
							int x=cur[0], y=cur[1];
							for(int k=0;k<4;k++) {
								if(arr[x+dx[k]][y+dy[k]]>=0 && !brr[x+dx[k]][y+dy[k]] &&
										l<=Math.abs(arr[x][y]-arr[x+dx[k]][y+dy[k]]) && Math.abs(arr[x][y]-arr[x+dx[k]][y+dy[k]])<=r) {
									brr[x+dx[k]][y+dy[k]]=true;
									q.add(new int[] {x+dx[k],y+dy[k]});
									temp+=arr[x+dx[k]][y+dy[k]];
									cnt++;
									used=true;
								}
							}
						}	
					}
					while(save.size()>0){
						int [] cur=save.poll();
						arr[cur[0]][cur[1]]=temp/cnt;
					}
				}
			}
			if(!used)
				break;
			ans++;
		}
		System.out.println(ans);
	}
}
