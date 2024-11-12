package silver;

import java.util.*;

public class Main_S1_1495 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), s=sc.nextInt(), m=sc.nextInt();
		int [] v = new int [n];	// 입력받는 볼륨
		int [][] dp=new int[n][m+1];	// 행은 n번째 볼륨, 열은 낼 수 있는 볼륨
		for(int i=0;i<n;i++) {
			v[i]=sc.nextInt();
			Arrays.fill(dp[i], -1);	// 전체를 -1로 초기화
		}
		int r1=s+v[0], r2 = s-v[0];	// 1번째 음악을 틀기 전에 볼륨 조절을 하기에 처음에 초기화
		if(r1>=0 && r1<=m)
			dp[0][r1]=r1;	// MAX값을 출력할 때 최대 값을 출력하기에 저장되는 값을 볼륨의 값으로 저장 
		if(r2>=0 && r2<=m)
			dp[0][r2]=r2;

		for(int i=1;i<n;i++) {	// 두번째 볼륨부터 확인
			for(int j=0;j<=m;j++) {	// 0부터 최대 볼륨까지 검사하면서 
				if(dp[i-1][j]>=0) {	// 앞선 볼륨 중 하나라도 도달 가능하면 그 볼륨부터의 탐색 
					r1=j+v[i];
					r2=j-v[i];
					if(r1>=0 && r1<=m)
						dp[i][r1]=r1;
					if(r2>=0 && r2<=m)
						dp[i][r2]=r2;
				}
			}
		}
		
		int ans=-1;	// 아무것도 출력이 안된다면 -1이기에 -1부터 비교
		for(int j=0;j<=m;j++) {
			ans=Math.max(ans, dp[n-1][j]);	// 최대 볼륨 크기가지 검사하면서 저장된 값 중 가장 큰 볼륨을 출력
		}
		System.out.println(ans);
	}
}
