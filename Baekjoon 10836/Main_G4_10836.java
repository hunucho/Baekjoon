package gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_G4_10836 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int m=Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		int [] increments = new int[2*m-1];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int loc=0;	// 증가할 부분의 위치정보
			for(int j=0;j<=2;j++) {	// 0, 1, 2의 갯수를 순차적으로 받기에 3번 반복한다
				int num=Integer.parseInt(st.nextToken());
				// 입력받은 횟수만큼 반복하면서, 좌측하단 -> 좌측상단 -> 우측상단으로 증가한다.
				for(int k=0;k<num;k++)
					increments[loc++]+=j;
			}
		}
		
		// 입력받은 조건에 따라 최종 형태는 최 상단의 행의 가장 큰값으로 정해진다
		// 다만 첫째열의 경우 그 값에서 나오는 형태이기에, 이 값은 다른데에서 나올 수 없다.
		
		// 첫째 행을 제외한 두번째 행부터 N까지의 형태는 동일함으로, StringBuilder를 이용하여 반복되는 구간을 줄인다.
		for(int j=m;j<2*m-1;j++)
			sb.append(increments[j]+1+" ");
		sb.append("\n");
		
		// 첫째행을 추가해주고, 나머지 뒷부분은 앞에서 만든 sb를 활용해서 append만 함
		for(int i=m-1;i>=0;i--) {
			bw.write(increments[i]+1+" ");
			bw.write(sb.toString());
		}
		bw.close();
	}
}
