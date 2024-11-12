package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B1_2755 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int credit = 0;
		String grade = "";
		double mark = 0;
		double avg = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			int temp_credit = Integer.parseInt(st.nextToken());

			credit += temp_credit;
			grade = st.nextToken();
			switch (grade.charAt(0)) {
			case 'A':
				mark = 4.0;
				break;
			case 'B':
				mark = 3.0;
				break;
			case 'C':
				mark = 2.0;
				break;
			case 'D':
				mark = 1.0;
				break;
			case 'F':
				mark = 0.0;
				break;
			}
			if (grade.length() > 1)
				switch (grade.charAt(1)) {
				case '+':
					mark += 0.3;
					break;
				case '-':
					mark -= 0.3;
					break;
				}
			avg+=temp_credit*mark;
		}
		System.out.printf("%.2f",avg/credit);

	}

}
