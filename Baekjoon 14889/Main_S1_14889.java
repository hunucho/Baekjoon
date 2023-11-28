import java.util.*;
import java.io.*;

public class Main {
	static int N, ans=Integer.MAX_VALUE;
	static int [][] team;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		team = new int [N][N];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++)
				team[i][j]=Integer.parseInt(st.nextToken());
		}
		makeTEAM(0, new boolean [N], 0);
		System.out.println(ans);
	}
	
	public static void makeTEAM(int s, boolean [] chk, int depth) {
		if(depth==N/2) {
			int start=0, link=0;
			for(int i=0;i<N;i++)
				for(int j=0;j<N;j++) {
					if(chk[i]==chk[j]) {
						if(chk[i])
							start+=team[i][j];
						else
							link+=team[i][j];
					}
				}
			ans=Math.min(ans, Math.abs(start-link));
			return;
		}
			
		for(int i=s;i<N;i++) {
			if(!chk[i]) {
				chk[i]=true;
				makeTEAM(i+1, chk, depth+1);
				chk[i]=false;
			}
		}
		
	}
	
}
