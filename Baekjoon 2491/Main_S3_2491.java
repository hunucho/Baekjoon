package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_S3_2491 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int inc_max = 0, inc_prev = -1, inc_cnt = 0, dec_max = 0, dec_prev = 999999, dec_cnt = 0;
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if (temp >= inc_prev) {
				inc_cnt++;
				if (inc_max < inc_cnt)
					inc_max = inc_cnt;
			} else
				inc_cnt = 1;
			inc_prev = temp;

			if (temp <= dec_prev) {
				dec_cnt++;
				if (dec_max < dec_cnt)
					dec_max = dec_cnt;
			} else
				dec_cnt = 1;
			dec_prev = temp;

		}
		System.out.println(Math.max(dec_max, inc_max));
	}
}
