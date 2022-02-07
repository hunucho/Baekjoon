package gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_G5_1918 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()), max = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<Integer> s1 = new Stack<>(), s2 = new Stack<>();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if (s1.size() > 0) {
				if (max < s1.peek())
					max = s1.peek();
				if (max > temp) {
					while (s1.peek() < temp) {
						s1.pop();
						s2.pop();
					}
					arr[i] = s2.peek();
				}
			}
			s1.push(temp);
			s2.push(i + 1);
		}
		for (int i = 0; i < n; i++)
			bw.write(arr[i] + " ");
		bw.close();
	}
}