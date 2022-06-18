package gold;

import java.io.*;
import java.util.*;

public class Main_G5_2170 {
	static class line implements Comparable<line>{
		int s,e;
		@Override
		public int compareTo(line o) {	// 시작점을 기준으로 오름차순 정렬
			if(this.s==o.s)	// 시작점이 동일하면 끝점을 기준으로 오름차순 정렬
				return this.e-o.e;
			return this.s-o.s;
		}
		public line(int s, int e) {
			this.s = s;
			this.e = e;
		}		
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()), ans=0;
		line [] lines = new line[n];
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			lines[i]=new line(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		Arrays.sort(lines);	// 1. 끝점 기준 오름차순 정렬, 2. 시작점기준 오름차순 정렬 
		int l=lines[0].s, r=lines[0].e;	// 정렬을 했기에 0번째가 가장 처음에 시작하는 위치
		for(int i=0;i<n;i++) {
			if(r<lines[i].s) {	// 다음 시작점이 선을 긋는 위치를 벗어났다면 새로운 선분이기에 긋고 있던 선의 길이를 저장
				ans+=r-l;	// 현재까지 긋던 선의 길이를 저장
				l=lines[i].s;	// 새로운 시작점
				r=lines[i].e;	// 새로운 끝점
			}
			else if(lines[i].s<=r)	// 시작점의 길이가 끝점보다 작다면 현재 긋는 선의 한점에서 시작되기에 
				r=Math.max(r,lines[i].e);	// 현재 긋는 선의 길이를 연장 혹은 그 안에서 해결
		}
		System.out.println(ans+r-l);	// 마지막에 그은 선의 길이를 저장
	}
}
