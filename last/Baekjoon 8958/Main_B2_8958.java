package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_B2_8958 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int score, continuity;
		String temp;
		for(int i=0;i<n;i++) {
			score=continuity=0;
			temp = br.readLine();
			for(int j=0;j<temp.length();j++) {
				if(temp.charAt(j)=='O') {
					continuity++;
					score+=continuity;
				}
				else
					continuity=0;
			}
			System.out.println(score);
		}
	}
}
