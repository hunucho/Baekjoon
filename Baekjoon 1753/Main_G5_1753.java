package gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_G5_1753 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(br.readLine());

		int[] distance = new int[v + 1];
		Arrays.fill(distance, Integer.MAX_VALUE);

		ArrayList<Node>[] nodes = new ArrayList[v + 1];

		for (int i = 1; i <= v; i++)
			nodes[i] = new ArrayList<>();

		for (int i = 1; i <= e; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken()), to = Integer.parseInt(st.nextToken()),
					weight = Integer.parseInt(st.nextToken());
			nodes[from].add(new Node(to, weight));
		}

		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		distance[start] = 0;
		pq.add(new Node(start, 0));

		while (pq.size() > 0) {
			Node cur = pq.poll();

			if (cur.weight > distance[cur.to])
				continue;

			for (int i = 0; i < nodes[cur.to].size(); i++) {
				Node next = nodes[cur.to].get(i);
				if (distance[next.to] > distance[cur.to] + next.weight) {
					distance[next.to] = cur.weight + next.weight;
					pq.add(new Node(next.to, distance[next.to]));
				}
			}
		}
		for (int i = 1; i <= v; i++) {
			if (distance[i] == Integer.MAX_VALUE)
				bw.write("INF\n");
			else
				bw.write(distance[i] + "\n");
		}
		bw.close();
	}
}

class Node implements Comparable<Node> {
	int to, weight;

	public Node(int to, int weight) {
		this.to = to;
		this.weight = weight;
	}

	@Override
	public int compareTo(Node o) {
		return this.weight - o.weight;
	}

}
