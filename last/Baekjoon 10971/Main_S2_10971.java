package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_S2_10971 {
	static int[][] arr;
	static boolean[] chk;
	static int n, ans = Integer.MAX_VALUE;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];	// 입력되는 행렬
		chk = new boolean[n];	// 방문체크
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0;i<n;i++) {
			chk[i]=true;
			tsp(i, 1, 0, i);
			chk[i]=false;
		}
		System.out.println(ans);
	}
	
	// 완전탐색의 형태로 전체 배열을 찾음
	public static void tsp(int loc, int cnt, int tmp, int start) {
		if (tmp > ans)	// 전에 저장된 값보다 더 큰 비용으로 순회한다면 바로 종료
			return;
		if (cnt == n) {	// 전체를 탐색했다면 가장 처음에 시작한 점으로 돌아가야 함
			if(arr[loc][start]!=0)	// 현 위치에서 처음에 시작함 점으로의 거리를 추가함
			ans = Math.min(tmp+arr[loc][start], ans);
			return;
		}
		for (int i = 0; i < n; i++) {
			if (!chk[i] && arr[loc][i]!=0) {
				chk[i] = true;
				tsp(i, cnt + 1, tmp + arr[loc][i],start);
				chk[i] = false;
			}
		}
		return;
	}
}
