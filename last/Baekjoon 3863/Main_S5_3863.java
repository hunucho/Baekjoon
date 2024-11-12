import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
			if(N==0 && M==0)
				break;
			int [][] Call = new int [N][4];
			for(int i=0;i<N;i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0;j<4;j++)
					Call[i][j]=Integer.parseInt(st.nextToken());
			}
			for(int j=0;j<M;j++) {
				int ans=0;
				st = new StringTokenizer(br.readLine());
				int Start = Integer.parseInt(st.nextToken()), Duration = Integer.parseInt(st.nextToken());
				for(int i=0;i<N;i++) {
					if(Start<=Call[i][2] && Call[i][2]<Start+Duration)
						ans++;
					else if(Call[i][2] <= Start && Start<Call[i][2]+Call[i][3])
						ans++;				
				}
				bw.write(ans+"\n");
			}
		}
		bw.close();
	}
}
