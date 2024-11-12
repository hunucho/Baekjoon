package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_S1_1149 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [][] paints = new int[n][3], houses=new int[n][3];
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			paints[i][0]=Integer.parseInt(st.nextToken());
			paints[i][1]=Integer.parseInt(st.nextToken());
			paints[i][2]=Integer.parseInt(st.nextToken());
			
		}
		houses[0][0]=paints[0][0];
		houses[0][1]=paints[0][1];
		houses[0][2]=paints[0][2];
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<3;j++) {
				if(j==0)
					houses[i][j]=Integer.min(houses[i-1][1]+paints[i][j], houses[i-1][2]+paints[i][j]);
				if(j==1)
					houses[i][j]=Integer.min(houses[i-1][2]+paints[i][j], houses[i-1][0]+paints[i][j]);
				if(j==2)
					houses[i][j]=Integer.min(houses[i-1][0]+paints[i][j], houses[i-1][1]+paints[i][j]);
			}
		}
		int ans = Integer.MAX_VALUE;
		for(int j=0;j<3;j++)
			if(houses[n-1][j]<ans)
				ans=houses[n-1][j];
		System.out.println(ans);
				
	}
}
