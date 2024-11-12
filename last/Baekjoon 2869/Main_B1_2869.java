package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B1_2869 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		int v=Integer.parseInt(st.nextToken());
		
		int day=1;		// 첫날에 바로 도착하면 1일
		v-=a;			// 1. 첫날에 도착하면 끝, 2. 마지막날에는 올라가기만 하기에 내려가는 일이 없음 
		day+=v/(a-b);	// 1일동안 올라가는 거리와 내려가는 거리를 계산해서 나누기로 계산함
		if(v%(a-b)>0)	// 만약에 남은거리가 있으면 하루 더 올라가야하기에 1일 추가를 해줌
			day++;
		
		System.out.println(day);
	}

}
