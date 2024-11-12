import java.io.*;
import java.util.*;

public class Main {
	static int[][] map, A, age;
	static int N;
	static ArrayList<ArrayList<PriorityQueue<Integer>>> tree;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()); // 크기, 나무의 정보, K년
		map = new int[N + 1][N + 1];
		A = new int[N + 1][N + 1];

		tree = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			tree.add(new ArrayList<>());
			for (int j = 0; j <= N; j++)
				tree.get(i).add(new PriorityQueue<>());
		}

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				map[i][j] = 5;
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken()),
					z = Integer.parseInt(st.nextToken());
			tree.get(x).get(y).add(z);
		}

		for (int i = 0; i < K; i++) {
			spring();
			autumn();
			winter();
		}

		int ans = 0;
		for (int i = 1; i <= N; i++)
			for (int j = 1; j <= N; j++) {
				while (tree.get(i).get(j).size() > 0) {
					tree.get(i).get(j).poll();
					ans++;
				}
			}
		System.out.println(ans);
	}

	static void spring() {
		age = new int[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			Queue<Integer> q = new LinkedList<Integer>();
			for (int j = 1; j <= N; j++) {
				int dead = 0;
				while (tree.get(i).get(j).size() > 0) {
					int cur = tree.get(i).get(j).poll();
					if (map[i][j] < cur)
						dead += cur / 2;
					else {
						map[i][j] -= cur;
						q.add(cur + 1);
						if ((cur + 1) % 5 == 0)
							age[i][j]++;
					}
				}
				while (q.size() > 0)
					tree.get(i).get(j).add(q.poll());
				map[i][j] += dead;
			}
		}
	}

	static void autumn() {
		int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 }, dy = { -1, 0, 1, -1, 1, -1, 0, 1 };
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				while (age[i][j] > 0) {
					for (int k = 0; k < 8; k++) {
						int nx = i + dx[k], ny = j + dy[k];
						if (nx >= 1 && nx <= N && ny >= 1 && ny <= N)
							tree.get(nx).get(ny).add(1);
					}
					age[i][j]--;
				}
			}
		}
	}

	static void winter() {
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				map[i][j] += A[i][j];
			}
		}
	}
}
