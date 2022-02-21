package gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_G5_1759 {
	static int l, c;
	static char[] plain, cipher;
	static boolean[] chk;

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void combi(int depth, int start, int consonant, int vowel) throws IOException {
		if (depth == l) {
			if(consonant>=2 && vowel>=1) {
				for(int i=0;i<l;i++)
					bw.write(cipher[i]);
				bw.write("\n");
			}
			return;
		}
		for (int i = start; i < c; i++) {
			if (!chk[i]) {
				chk[i] = true;
				if(isVowel(plain[i]))
					vowel++;
				else
					consonant++;
				cipher[depth]=plain[i];
				combi(depth + 1, i + 1, consonant, vowel);
				chk[i] = false;
				if(isVowel(plain[i]))
					vowel--;
				else
					consonant--;
			}
		}
	}

	public static boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return true;
		return false;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		l = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		plain = new char[c];
		cipher = new char[l];
		chk = new boolean[c];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < c; i++)
			plain[i] = st.nextToken().charAt(0);
		Arrays.sort(plain);
		combi(0,0,0,0);
		bw.close();
	}
}
