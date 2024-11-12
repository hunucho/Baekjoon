import java.io.*;
import java.util.*;

public class Main {
	static int N, K, ans;
	static String[] words;
	static boolean[][] word;
	static boolean[] teach;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		words = new String[N];
		word = new boolean[N + 1][26];
		teach = new boolean[26];

		for (int i = 0; i < N; i++) {
			words[i] = br.readLine();
			for (char ch : words[i].toCharArray()) {
				word[i][ch - 'a'] = true;
				word[N][ch - 'a'] |= true;
			}
		}
		String antatica = "antatica";
		for (char ch : antatica.toCharArray())
			if (!teach[ch - 'a']) {
				teach[ch - 'a'] = true;
				K--;
			}
		if (K >= 0)
			Find(0, K, teach);
		System.out.println(ans);
	}

	public static void Find(int s, int K, boolean[] alpha) {
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			boolean chk = true;
			for (int j=0;j<26;j++)
				if (word[i][j] && !alpha[j])
					chk = false;
			if (chk)
				cnt++;
		}
		ans = Math.max(ans, cnt);
		if (K <= 0)
			return;

		for (int i = s; i < 26; i++) {
			if (!alpha[i] && word[N][i]) {
				alpha[i] = true;
				Find(i, K - 1, alpha);
				alpha[i] = false;
			}
		}
	}
}
