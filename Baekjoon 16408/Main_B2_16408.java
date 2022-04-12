package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B2_16408 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] ranks = new int[14];
		for (int i = 0; i < 5; i++) {
			String str = st.nextToken();

			if (str.charAt(0) == 'A')
				ranks[1]++;
			else if ('2' <= str.charAt(0) && str.charAt(0) <= '9')
				ranks[str.charAt(0) - '0']++;
			else if (str.charAt(0) == 'T')
				ranks[10]++;
			else if (str.charAt(0) == 'J')
				ranks[11]++;
			else if (str.charAt(0) == 'Q')
				ranks[12]++;
			else if (str.charAt(0) == 'K')
				ranks[13]++;
		}
		int max=0;
		for(int i=1;i<14;i++)
			max=Math.max(max, ranks[i]);
		System.out.println(max);
	}
}
