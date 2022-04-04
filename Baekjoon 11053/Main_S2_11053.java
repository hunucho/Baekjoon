package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_S2_11053 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n], dp=new int[n];
		int maxlen=0;
		for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		
		for(int i=0;i<n;i++) {
			dp[i]=1;	// 자기 자신으로 구성하면 길이는 1
			for(int j=0;j<i;j++) {	// 현재 원소부터 i원소 이전까지 비교
				if(arr[j]<arr[i] && dp[j]+1>dp[i])
					dp[i]=dp[j]+1;
			}
		}
		for(int i=0;i<n;i++)
			if(maxlen<dp[i])
				maxlen=dp[i];
		System.out.println(maxlen);
	}
}
