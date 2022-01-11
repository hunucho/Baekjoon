package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_B2_2775 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[][] apt = new int[15][15];
		for(int i=0;i<15;i++)
			apt[0][i]=i+1;		// 0층 초기화
		for(int i=1;i<15;i++) {	// 먼저 층수별로 거주중인 사람 수를 계산함
			int temp=0;
			for(int j=0;j<15;j++) {
				temp+=apt[i-1][j];
				apt[i][j]=temp;
			}
		}
		for(int i=0;i<t;i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			System.out.println(apt[k][n-1]);
		}	
	}
}
