package silver;

import java.io.*;

public class Main_S5_4396 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n= Integer.parseInt(br.readLine());
		char [][] map = new char [n+2][n+2], ans=new char[n+2][n+2];
		for(int i=1;i<=n;i++) {
			String str = br.readLine();
			for(int j=1;j<=n;j++) {
				map[i][j]=str.charAt(j-1);
				ans[i][j]='.';
			}
		}
		boolean mine=false;
		for(int i=1;i<=n;i++) {
			String str = br.readLine();
			for(int j=1;j<=n;j++)
				if(str.charAt(j-1)=='x') {
					if(map[i][j]=='*')
						mine=true;
					int cnt=0;
					for(int k=i-1;k<=i+1;k++)
						for(int l=j-1;l<=j+1;l++)
							if(map[k][l]=='*')
								cnt++;
					ans[i][j]=(char) (cnt+'0');
				}					
		}
		if(mine) {
			for(int i=1;i<=n;i++)
				for(int j=1;j<=n;j++)
					if(map[i][j]=='*')
						ans[i][j]='*';
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
				sb.append(ans[i][j]);
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
