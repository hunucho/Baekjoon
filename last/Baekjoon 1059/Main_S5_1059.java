package silver;

import java.io.*;
import java.util.*;

public class Main_S5_1059 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l=Integer.parseInt(br.readLine()), ans=0;
		int [] s = new int[l];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<l;i++)
			s[i]=Integer.parseInt(st.nextToken());
		Arrays.sort(s);
		int n=Integer.parseInt(br.readLine());
		if(n<s[0]) {	// n이 s의 가장 작은 값 보다 작으면 나올 수 있는 경우의 수 
			ans+=(s[0]-n)*(n-1);	// 찾는 값과 뒤로 있는 수의 갯수를 구하고, 찾는 값보다 앞에 있는 값을 곱하면 
			ans+=s[0]-1-n;	// 검색 값 뒤로 있는 갯수를 찾아서 [n, n+1], [n, n+2], [n, n+m]이 될 수 있는 수를 찾음
		}
		// 5
		// 5 7 9 10 12
		// 3
		// 이 경우에 [1 2 3 4]를 이용하여 값을 찾을때 [1, 3], [1, 4], [2, 3], [2, 4], [3, 4]로 답은 5가 나온다
		// [1, 3], [1, 4], [2, 3], [2, 4]는 찾는 값보다 작은 수로 시작하는 구간을 찾는다.
		// [3, 4]는 찾는 값을 기준으로 이후에 있는 갯수를 구해서 찾는다
		else {
			for(int i=1;i<l;i++) {
				if(s[i-1]< n && n<s[i]) {
					ans+=(s[i]-n)*(n-(s[i-1]+1));
					ans+=s[i]-1-n;
					break;
				}				
			}
		}
		System.out.println(ans);
	}
}
