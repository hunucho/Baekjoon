package gold;

import java.io.*;
import java.util.*;

public class Main_G4_1469 {
	static int [] x, s, ans;
	static int n;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		x = new int[n];	// 입력받는 숫자의 집합
		s = new int[n*2];	// 임시로 형성되는 숌 수열
		ans=new int[n*2];	// 최종 정답
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
			x[i]=Integer.parseInt(st.nextToken());
		Arrays.fill(s, -1);	// 방문처리 + 임시저장
		Arrays.fill(ans, 99);	// 최종 저장될 답을 저장
		Arrays.sort(x);	// 입력받은 숫자들을 정렬하여 큰 수를 뒤에서 채우는 방식으로 생성가능한 수열 탐색
		f(0, n-1);
		if(ans[0]==99)	// 만약에 저장된 값이 없다면, 숌 수열이 생성되지 않았기에 -1을 출력
			System.out.println(-1);
		else
			for(int i=0;i<2*n;i++)
				System.out.print(ans[i]+" ");
	}
	
	public static void f(int cnt, int pos) {	// cnt는 숫자들을 하나씩 사용하며 수열을 생성
		if(cnt==n) {
			if(Arrays.compare(ans, s)>0)	// 다양하게 숫자들이 수열들이 생성 될 수 있기에, 만들어진 수열들을 저장하며 사전순으로 가장 빠른것을 최종 답으로 저장
				for(int i=0;i<2*n;i++)
					ans[i]=s[i];
		}
		else {
			for(int j=2*n-1;j>=0;j--) {	// 가장 뒤웁터 가장 큰수를 채워나감으로 탐색을 최소화 함
				if(j-x[pos]-1>=0 && s[j-x[pos]-1]==-1 && s[j]==-1) {	// 마지막위치와 그 위치에서 i사이에 수를 i개 두는 위치에 현재 값을 놓을 수 있는지 판단
					s[j]=s[j-x[pos]-1]=x[pos];
					f(cnt+1,pos-1);
					s[j]=s[j-x[pos]-1]=-1;
				}
			}
		}
	}
}
