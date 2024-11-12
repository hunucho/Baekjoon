package silver;

import java.io.*;
import java.util.*;

public class Main_S2_23757 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), i=0;
		PriorityQueue<Integer> gift = new PriorityQueue<Integer>(Collections.reverseOrder());
		// 선물은 지속적으로 가장 큰 선물 상자를 이용하기에 우선순위큐를 내림차순으로 이용하여 head부분에 항상 가장 큰 선물 개수가 오도록 함
		int [] child = new int[m];
		// 학생들은 부여된 순서대로 선물을 챙김

		st = new StringTokenizer(br.readLine());
		for(i=0;i<n;i++)
			gift.add(Integer.parseInt(st.nextToken()));
		st = new StringTokenizer(br.readLine());
		for(i=0;i<m;i++)
			child[i] = Integer.parseInt(st.nextToken());
		i=0;
		while(i<m && gift.size()>0) {
			if(child[i]==gift.peek()) {	// 학생이 원하는 선물의 개수와 현재 최대 선물 개수가 동일하다면 학생번호를 증가시키고 선물을 삭제
				i++;
				gift.poll();
			}else if(child[i]<gift.peek())	// 최대 선물 개수가 더 크다면 선물을 가져가고 남은 선물을 다시 큐에 삽입 
				gift.add(gift.poll()-child[i++]);
			else	// 선물을 못가져 간다면 아이들이 실망하면서 종료
				break;
		}
		if(i==m)	// 학생들이 증가해서 마지막학생까지 선물을 가져갔다면 1을 출력
			System.out.println(1);
		else
			System.out.println(0);
	}
}
