package gold;

import java.io.*;
import java.util.*;

public class Main_G3_21774 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n=Integer.parseInt(st.nextToken()), q=Integer.parseInt(st.nextToken());
		int [][] lvs = new int [n+1][7];	// 누적합을 이용하여 사이합을 찾기 위한 lvs 배열
		String [] log = new String[n+3];
		log[0]="1999-12-31 23:59:59";	// 입력으로 주어지지 않는 가장 오래된 로그
		for(int i=1;i<=n;i++) {	// 로그 입력
			st = new StringTokenizer(br.readLine(),"#");	// #을 구분으로 입력 로그를 분리
			log[i]=st.nextToken();
			lvs[i][0]=Integer.parseInt(st.nextToken());
		}
		log[n+1]="2222-12-31 23:59:59";	// 입력으로 주어지지 않는 가장 최근 로그
		
		for(int i=1;i<=n;i++)	// 최대합은 0행에 저장후, lv6의 경우 lv1~lv6범위를 만족하기에 그만큼 범위합을 채워줌
			for(int j=1;j<=lvs[i][0];j++)
				lvs[i][j]++;
		
		for(int i=1;i<=n;i++)	// 누적합 배열 생성
			for(int j=1;j<=6;j++)
				lvs[i][j]+=lvs[i-1][j];
		
		String s, e;	// 이분탐색으로 범위사이의 값을 찾는 로그시간
		for(int i=0;i<q;i++) {
			int l=0,r=n+1,m, start, end;
			st = new StringTokenizer(br.readLine(),"#");
			s=st.nextToken();
			e=st.nextToken();
			int lv=Integer.parseInt(st.nextToken());
			
			while(l<=r) {	// 중복을 허용하는 최소값을 찾는 이분 탐색
				m=(l+r)/2;
				if(log[m].compareTo(s)<0)
					l=m+1;
				else
					r=m-1;
			}
			start=l;
			
			l=0;
			r=n+1;
			while(l<=r) {	// 중복을 허용하는 최대값을 찾는 이분 탐색
				m=(l+r)/2;
				if(log[m].compareTo(e)<=0)
					l=m+1;
				else
					r=m-1;
			}
			end=r;
			
			sb.append(lvs[end][lv]-lvs[start-1][lv]+"\n");	// 누적합을 이용하여 최대시간에서 최소시간의 값을 빼서 사이값을 찾음
		}
		System.out.println(sb.toString());
	}
}
