package gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_G5_9019 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0;i<t;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int from=Integer.parseInt(st.nextToken()), to = Integer.parseInt(st.nextToken());
			boolean [] chk = new boolean[10000];
			Queue<Integer> q = new LinkedList<Integer>();
			Queue<String> cmd = new LinkedList<String>();
			q.add(from);	// 시작 값 
			cmd.add("");	// 시작 문자열은 공백으로 줌
			while(q.size()>0) {
				int cur=q.poll();
				String op=cmd.poll();
				
				if(!isChk((cur*2)%10000, chk)) {	// D를 연산
					q.add((cur*2)%10000);
					cmd.add(op+'D');
					if(chk[to]) {		// 만약에 방문한다면 바로 종료 시켜 필요없는 반복을 줄임
						bw.write(op+"D\n");
						break;
					}
				}
				if(!isChk((cur+10000-1)%10000, chk)) {	// S를 연산
					q.add((cur+10000-1)%10000);
					cmd.add(op+'S');
					if(chk[to]) {
						bw.write(op+"S\n");
						break;
					}
				}
				if(!isChk((cur*10+cur/1000)%10000, chk)) {	// L을 연산
					q.add((cur*10+cur/1000)%10000);
					cmd.add(op+'L');
					if(chk[to]) {
						bw.write(op+"L\n");
						break;
					}
				}
				if(!isChk((cur%10*1000+cur/10)%10000, chk)) {	// R을 연산
					q.add((cur%10*1000+cur/10)%10000);
					cmd.add(op+'R');
					if(chk[to]) {
						bw.write(op+"R\n");
						break;
					}
				}
			}
		}
		bw.close();
	}
	
	static boolean isChk(int num, boolean[]chk) {	// 들어오는 값으로 부터 방문한 값인지 확인
		if(chk[num])
			return true;
		chk[num]=true;		// 방문을 안했다면 방문처리를 함
		return false;
	}
	
}
