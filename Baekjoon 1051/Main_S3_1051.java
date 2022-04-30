package silver;

import java.io.*;
import java.util.*;

public class Main_S3_1051 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n= Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken()), ans=1;
		char [][] arr = new char [n][m];
		for(int i=0;i<n;i++)
			arr[i]=br.readLine().toCharArray();
		// 이중 for문으로 전체탐색
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				
				// 이 부분부터 동일한 넓이로 정사각형을 만들어가며 각 꼭지점이 동일한지 판단 
				for(int k=1;i+k<n&&j+k<m;k++) {	// for문 조건문에 i+k가 n보다 작고 j+k가 m보다 작아 입력받은 배열을 벗어나지 못하도록 한다
					// 왼쪽 상단의 꼭지점이랑 다른 꼭지점을 비교하여 모두가 동일하다면 꼭지점으로 이루어진 정사각형이다
					if(arr[i][j]==arr[i+k][j] && arr[i][j]==arr[i][j+k] && arr[i][j]==arr[i+k][j+k])
						ans=Math.max(ans, (k+1)*(k+1));
				}
		System.out.println(ans);
	}
}
