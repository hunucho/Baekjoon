package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_G4_2116 {
	static HashMap<Integer, Integer> match = new HashMap<Integer, Integer>();

	public static int maxnum(int[][] dice, int cnt, int k, int n) {
		if(cnt==n)
			return 0;
		int nk=-1;
		for(int i=0;i<6;i++)
			if(dice[cnt+1][i]==dice[cnt][match.get(k)])
				nk=i;
		boolean[] chk = new boolean[6];
		int tmax = 0;		
		if (k == 0 || k == 5)
			chk[0] = chk[5] = true;
		else if (k == 1 || k == 3)
			chk[1] = chk[3] = true;
		else if (k == 2 || k == 4)
			chk[2] = chk[4] = true;
		for (int i = 0; i < 6; i++) 	
			if (!chk[i])
				tmax = Math.max(tmax, dice[cnt][i]);
		tmax += maxnum(dice, cnt + 1, nk, n);
		return tmax;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] dice = new int[n+1][6];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 6; j++)
				dice[i][j] = Integer.parseInt(st.nextToken());
		}
		match.put(0, 5);
		match.put(1, 3);
		match.put(2, 4);
		match.put(5, 0);
		match.put(3, 1);
		match.put(4, 2);
		
		int max = 0;
		for (int i = 0; i < 6; i++) {
			int temp = maxnum(dice, 0, i, n);
			if (max < temp)
				max = temp;
		}
		System.out.println(max);
	}
}