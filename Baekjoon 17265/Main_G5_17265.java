package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_G5_17265 {
	static int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, n;
	static char op;
	static char [] dx = {1,0},dy = {0,1}; 
	public static void dfs(char[][] map, int x, int y, int sum, char op) {
		if ((x + y) % 2 == 1) { // oper
			op = map[x][y];
		} else {
			if(op=='+')
				sum += map[x][y] - '0';
			else if(op=='*')
				sum *= map[x][y] - '0';
			else if(op=='-')
				sum -= map[x][y] - '0';
			
			if (x == n && y == n) {
				if (sum < min)
					min = sum;
				if (sum > max)
					max = sum;
				return;
			}
		}
		for(int i=0;i<2;i++) {
			if(x+dx[i]<=n && y+dy[i]<=n)
				dfs(map,x+dx[i],y+dy[i],sum,op);
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());

		char[][] map = new char[n + 2][n + 2];
		for (int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= n; j++)
				map[i][j] = st.nextToken().charAt(0);
		}
		dfs(map, 1, 1, 0, '+');
		System.out.println(max+ " "+min);
	}
}
