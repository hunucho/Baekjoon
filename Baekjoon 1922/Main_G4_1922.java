package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_G4_1922 {
	static int[] nodes;
	static int v, e;

	public static void init() {
		for (int i = 0; i <= v; i++)
			nodes[i] = i;
	}

	public static void union(int x, int y) {
		x = find(x);
		y = find(y);
		if (x > y)
			nodes[y] = x;
		else if (x < y)
			nodes[x] = y;
	}

	public static int find(int x) {
		if (x == nodes[x])
			return x;
		return nodes[x] = find(nodes[x]);
	}

	public static boolean isSameParent(int x, int y) {
		x = find(x);
		y = find(y);
		if (x == y)
			return true;
		return false;
	}

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Node1922> q = new PriorityQueue<Node1922>();
		v = Integer.parseInt(br.readLine());
		e = Integer.parseInt(br.readLine());
		nodes = new int[v + 1];
		init();
		int sum = 0;
		for (int i = 0; i < e; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Node1922 node = new Node1922();
			node.S = Integer.parseInt(st.nextToken());
			node.E = Integer.parseInt(st.nextToken());
			node.W = Integer.parseInt(st.nextToken());
			q.add(node);
		}
		while (q.size() > 0) {
			Node1922 node = q.poll();
			if (!isSameParent(node.S, node.E)) {
				union(node.S, node.E);
				sum += node.W;
			}
		}
		System.out.println(sum);
	}
}

class Node1922 implements Comparable<Node1922> {
	int S, E, W;

	@Override
	public int compareTo(Node1922 o) {
		return this.W - o.W;
	}
}