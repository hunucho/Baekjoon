package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_S4_1026 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [] arr = new int[n], brr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
			brr[i]=Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		Arrays.sort(brr);
		// 두개의 배열을 입력받고 둘다 정렬을 한다.
		// 문제에서는 B의 수는 재배열하면 안된다고 하지만, 가장 큰 값과 가장 작은 값을 곱해서 더하는 것이 최소의 값을 나타낼 수 있기에
		// arr의 최소값과 brr의 최대값을 곱하기 연산을 한다
		int ans=0;
		for(int i=0;i<n;i++)
			ans+=arr[i]*brr[n-i-1];
		System.out.println(ans);
	}
}
