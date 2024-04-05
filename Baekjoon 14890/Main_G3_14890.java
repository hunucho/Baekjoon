import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/14890

class Main {
	static int [][] map;
	static boolean [] used;
	static int N, L, row, col;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());		
		N=Integer.parseInt(st.nextToken());
		L=Integer.parseInt(st.nextToken());
		map = new int [N+2][N+2];
		used = new boolean [N+1];
		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1;j<=N;j++)
				map[i][j]=Integer.parseInt(st.nextToken());
		}
		for(int i=1;i<=N;i++)
			row+=findRow(i)?1:0;
		for(int j=1;j<=N;j++)
			col+=findCol(j)?1:0;
		System.out.println(row+col);
	}	
	
	public static boolean findRow(int r) {
		boolean ret = true;
		Arrays.fill(used, false);
		for(int j=2;j<=N;j++) {
			if(map[r][j-1]==map[r][j])
				continue;
			if(Math.abs(map[r][j]-map[r][j-1])>1)
				return false;
			if(!checkRow(r, j))
				return false;
			if(map[r][j-1]>map[r][j])
				j+=L-1;
		}
//		System.out.println("findRow" + r);
		return ret;
	}
	
	public static boolean checkRow(int r, int c) {
		if(map[r][c-1]>map[r][c]) {		// 높 -> 낮
			for(int i=1;i<L;i++) {
				if(c+i>N || c-i<0)
					return false;
				if(used[c+i])
					return false;
				if(map[r][c]!=map[r][c+i])
					return false;
			}
			used[c+L-1]=true;
		} else {						// 낮 -> 높
			for(int i=0;i<L;i++) {
				if(c-i-1<1)
					return false;
				if(used[c-1-i])
					return false;
				if(map[r][c-1-i]!=map[r][c-1])
					return false;
			}
			used[c-1]=true;
		}
		return true;
	}
	
	public static boolean findCol(int c) {
		boolean ret = true;
		Arrays.fill(used, false);
		for(int i=2;i<=N;i++) {
			if(map[i-1][c]==map[i][c])
				continue;
			if(Math.abs(map[i][c]-map[i-1][c])>1)
				return false;
			if(!checkCol(i, c))
				return false;
			if(map[i-1][c]>map[i][c])
				i+=L-1;
		}
//		System.out.println("findCol" + c);
		return ret;
	}
	
	public static boolean checkCol(int r, int c) {
		if(map[r-1][c]>map[r][c]) {		// 높 -> 낮
			for(int i=1;i<L;i++) {
				if(r+i>N || r-i<0)
					return false;
				if(used[r+i])
					return false;
				if(map[r][c]!=map[r+1][c])
					return false;
			}
			used[r+L-1]=true;
		} else {						// 낮 -> 높
			for(int i=0;i<L;i++) {
				if(r-i-1<1)
					return false;
				if(used[r-1-i])
					return false;
				if(map[r-1-i][c]!=map[r-1][c])
					return false;
			}
			used[r-1]=true;
		}
		return true;
	}
}




