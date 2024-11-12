package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_S1_9205 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		for (int test_case = 0; test_case < t; test_case++) {
			Queue<Integer> q = new LinkedList<Integer>();
			int n = Integer.parseInt(br.readLine());
			int[][] position = new int[n+2][2];
			boolean[] chk = new boolean[n+2];
			StringTokenizer st;
			for (int i = 0; i < n+2; i++) {
				st = new StringTokenizer(br.readLine());
				position[i][0] = Integer.parseInt(st.nextToken());
				position[i][1] = Integer.parseInt(st.nextToken());
				if (Math.abs(position[i][0] - position[0][0]) + Math.abs(position[i][1] - position[0][1]) <= 1000) {
					q.add(i);
					chk[i] = true;
				}
			}
			
			while (q.size() > 0 && !chk[n+1]) {
				int index = q.poll();
				for (int i = 1; i < n+2; i++)
					if (!chk[i]) {
						if (Math.abs(position[index][0] - position[i][0])
								+ Math.abs(position[index][1] - position[i][1]) <= 1000) {
							q.add(i);
							chk[i] = true;
						}
					}
			}
			if(chk[n+1])
				bw.write("happy\n");
			else
				bw.write("sad\n");
		}
		bw.close();
	}

}
