package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_G4_1987 {
	static boolean[] alpha = new boolean[26];
	static char [][] map;
	static int longest, r, c;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		map = new char[r][c];
		for (int i = 0; i < r; i++) {
			String str = br.readLine();
			for (int j = 0; j < c; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		move(0,0,1);
		System.out.println(longest);
	}
	
	public static void move(int x,int y, int length) {
		int[] dx=new int[] {-1,1,0,0}, dy=new int[] {0,0,-1,1};
		alpha[map[x][y]-'A']=true;
		if(length>longest)
			longest=length;
		for(int i=0;i<4;i++) {
			if(x+dx[i]>=0 && x+dx[i]<r && y+dy[i]>=0 && y+dy[i]<c)
				if(!isUsed(map[x+dx[i]][y+dy[i]])) {
					move(x+dx[i], y+dy[i], length+1);
				}
		}
		alpha[map[x][y]-'A']=false;
	}

	public static boolean isUsed(char step) {
		if(alpha[step - 'A'])
			return true;
		return false;
	}
}
