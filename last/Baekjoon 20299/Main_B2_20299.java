package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_B2_20299 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[][] arr = new int [500000][3];
		int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()), L = Integer.parseInt(st.nextToken());
		int cnt=0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken()), x2 = Integer.parseInt(st.nextToken()), x3 = Integer.parseInt(st.nextToken());
			if(x1+x2+x3<K || x1<L || x2<L ||x3<L) 
				continue;
			arr[cnt][0]=x1;
			arr[cnt][1]=x2;
			arr[cnt][2]=x3;
			cnt++;			
		}
		bw.write(cnt+"\n");
		for(int i=0;i<cnt;i++)
			for(int j=0;j<3;j++)
				bw.write(arr[i][j]+" ");
		bw.close();
	}
}
