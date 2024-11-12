package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_G5_16928 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, Integer> ladder = new HashMap<Integer, Integer>(), snake = new HashMap<Integer, Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			int k=Integer.parseInt(st.nextToken()), v=Integer.parseInt(st.nextToken());
			ladder.put(k, v);
		}
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int k=Integer.parseInt(st.nextToken()), v=Integer.parseInt(st.nextToken());
			snake.put(k, v);
		}
		Queue<int[]> q = new LinkedList<int[]>();
		boolean [] chk = new boolean[110];
		q.add(new int[] {1,0});
		int pos=0, cnt=0;
		while(q.size()>0) {
			int [] cur = q.poll();
			pos = cur[0];
			cnt=cur[1];
			if(pos==100)
				break;
			for(int i=1;i<=6;i++) {
				int next=pos+i;
				if(!chk[next]) {
					next=ladder.get(next)!=null?ladder.get(next):next;
					next=snake.get(next)!=null?snake.get(next):next;
					q.add(new int[] {next, cnt+1});
					chk[next]=true;
				}
			}
		}
		System.out.println(cnt);
	}
}
