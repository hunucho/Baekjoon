package silver;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main_S3_15666 {
	static boolean [] checked = new boolean[10];
	static int n, m;
	static int[] res = new int[10], data, number=new int[10005];
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static HashSet<String> s = new HashSet<String>();
	public static void f(int start, int depth) throws Exception {
		if (depth == m) {
			StringBuilder sb=new StringBuilder();
			for (int i = 0; i < m; i++)
				sb.append(res[i]+" ");
			if(s.contains(sb.toString()))
				return;
			else {
				s.add(sb.toString());
				bw.write(sb.toString()+"\n");
				return;
			}
		}
		for (int i = start; i < n; i++) {
			if(!checked[i]) {
				res[depth] = data[i];
				checked[i]=false;
				f(i, depth + 1);
				checked[i]=false;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		data = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
			number[data[i]]++;
		}
		Arrays.sort(data);
		f(0, 0);
		bw.close();
		sc.close();
	}
}
