package gold;

import java.io.*;
import java.util.*;

public class Main_G5_1092 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		ArrayList<Integer> crains = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
			crains.add(Integer.parseInt(st.nextToken()));
		
		int m=Integer.parseInt(br.readLine());
		ArrayList<Integer> boxes = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<m;i++)
			boxes.add(Integer.parseInt(st.nextToken()));
		
		Collections.sort(crains, Collections.reverseOrder());	// 크레인의 정보를 입력받고 내림차순으로 정렬
		Collections.sort(boxes, Collections.reverseOrder());	// 박스의 정보를 입력받고 내림차순으로 정렬
		
		if(crains.get(0)<boxes.get(0))	// 가장 무거운 박스를 들지 못한다면 -1출력 후 종료
			System.out.println(-1);
		else {
			int ans=0;	// 시간변수
			while(boxes.size()>0) {	// Box가 남아있을때까지
				int j=0;	// 박스의 index
				for(int i=0;i<n;) {	// 크레인을 바꿔가면서 들 수 있는 가장 무거운 box를 옮김
					if(crains.get(i)>=boxes.get(j)) {	// 크레인이 박스를 들 수 있을때
						boxes.remove(j);	// 옮긴 박스는 삭제
						i++;	// 사용된 크레인은 1분뒤에 사용 가능하기에 크레인 번호를 바꿈
					}
					else
						j++;	// 들 수 없을때는 가벼운 box를 찾음
					if(j==boxes.size())	// 가장 가벼운 box까지 찾았을때 다시 처음으로 돌아가서 가장 무거운 크레인이 동작
						break;
				}				
				ans++;	// 크레인들이 하나 이상의 box를 옮기면 1분이 지난다.
			}
			System.out.println(ans);
		}
	}
}
