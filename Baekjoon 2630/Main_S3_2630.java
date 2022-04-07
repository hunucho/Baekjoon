package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_S3_2630 {
	static int blue,white;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		int [][] map = new int [n][n];
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<n;j++)
				map[i][j]=Integer.parseInt(st.nextToken());
		}
		count(map, 0, 0, n);
		System.out.println(white);
		System.out.println(blue);
		
	}
	
	public static void count(int[][]map,int si,int sj, int size) {
		int cnt=0;
		for(int i=si;i<si+size;i++) {
			for(int j=sj;j<sj+size;j++)
				cnt+=map[i][j];
		}
		if(cnt==0)
			white++;
		else if(size*size==cnt)
			blue++;
		else {
			count(map, si, sj, size/2);
			count(map, si+size/2, sj, size/2);
			count(map, si, sj+size/2, size/2);
			count(map, si+size/2, sj+size/2, size/2);
		}
	}
}
