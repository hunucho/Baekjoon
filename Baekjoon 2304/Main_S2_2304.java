package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_S2_2304 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] map=new int[1002], height = new int[1002];
		int n = Integer.parseInt(br.readLine()), maxh=0, maxl=0, ans=0, pole;
		for(int k=0;k<n;k++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int l=Integer.parseInt(st.nextToken());
			int h=Integer.parseInt(st.nextToken());
			map[l]=h;
			maxh=Math.max(maxh,h);	// 가장 높은 기둥의 높이
			maxl=Math.max(maxl,l);	// 가장 멀리 떨어진 기둥의 위치
		}
		
		pole=map[1];	// 좌측부터 시작하는 기둥으로 그려지는 다각형
		for(int i=1;i<=maxl;i++) {	// 좌측부터 끝까지 돌면서 증가하는 형태로 높이를 측정
			pole=Math.max(pole, map[i]);
			height[i]=pole;
		}
		pole=map[maxl];	// 우측부터 시작하는 기둥로 그려지는 다각형
		for(int i=maxl;i>=1;i--) {
			pole=Math.max(pole, map[i]);
			if(pole==maxh)	// 만약 가장 높은 높이의 기둥을 만난다면 끝낸다
				break;
			height[i]=pole;
		}
		// 가장 높은 건물을 만났을때
		// 1. ㅂ 형태로 세어진 기둥이라면 중간에 들어간 공간이 없어야함 -> 정지
		// 2. ㅅ 형태로 증가하는 기둥이라면 그 위치에서 더 간다면 좌측에서 이미 생성된 지붕보다 높이 측정됨
		
		// 모든 그려진 지붕의 높이를 측정해서 값을 출력
		for(int i=1;i<=maxl;i++)
			ans+=height[i];
		System.out.println(ans);
		
	}
}
