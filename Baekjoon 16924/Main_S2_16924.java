import java.io.*;
import java.util.*;

class Main {
	static boolean [][] map, arr;
	static int N,M;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		map = new boolean [N][M];
		arr = new boolean [N][M];
		int ans=0;
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			for(int j=0;j<M;j++)
				if(str.charAt(j)=='*')
					map[i][j]=true;
		}
		for(int k=1;k<Math.min(N, M);k++) {
			for(int i=1;i<N;i++) {
				for(int j=1;j<M;j++) {
					if(cross(i,j,k)) {
						ans++;
						sb.append(i+1+" "+(j+1)+" "+k+"\n");
					}
				}
			}
		}
		if(isEqual())
			System.out.println(ans+"\n"+sb.toString());
		else
			System.out.println("-1");
	}
	
	public static boolean cross(int R, int C, int size) {
		for(int i=-size;i<=size;i++) {
			if(R+i>=0 && R+i<N) {
				if(!map[R+i][C])
					return false;
			}
			else
				return false;
		}
		
		for(int j=-size;j<=size;j++) {
			if(C+j>=0 && C+j<M) {
				if(!map[R][C+j])
					return false;
			}
			else
				return false;
		}
		
		for(int i=-size;i<=size;i++) {
			arr[R+i][C] = true;
			arr[R][C+i] = true;
		}
		return true;
	}
	
	public static boolean isEqual() {
		for(int i=0;i<N;i++)
			for(int j=0;j<M;j++)
				if(map[i][j]!=arr[i][j])
					return false;
		return true;
	}
}
