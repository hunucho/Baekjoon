package gold;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_G5_12851 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt(), min=Integer.MAX_VALUE, cnt=0;
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[] { n, 0 });
		int[] cur = null, chk = new int[100010];
		for(int i=0;i<100001;i++)
			chk[i]=-1;
		chk[n] = 0;
		while (q.size() > 0) {
			cur = q.poll();
			
			if(cur[0]==k && cur[1]>min)
				break;
			if(cur[0]==k && cur[1]<=min) {
				min=Math.min(cur[1], min);
				cnt++;
			}
			
			if (cur[0] < 0 || cur[0] > 100000)
				continue;
			if (cur[0] * 2 >= 0 && cur[0] * 2 <= 100000 && (chk[cur[0] * 2]>=cur[1]+1 || chk[cur[0]*2]==-1)) {
				chk[cur[0] * 2] = cur[1] + 1;
				q.add(new int[] { cur[0] * 2, cur[1] + 1 });
			}
			if (cur[0] + 1 >= 0 && cur[0] + 1 <= 100000 && (chk[cur[0] + 1]>=cur[1]+1 || chk[cur[0]+1]==-1) ) {
				chk[cur[0] + 1] = cur[1]+1;
				q.add(new int[] { cur[0] + 1, cur[1] + 1 });
			}
			if (cur[0] - 1 >= 0 && cur[0] - 1 <= 100000 && (chk[cur[0] - 1]>=cur[1]+1 || chk[cur[0]-1]==-1)) {
				chk[cur[0] - 1] = cur[1]+1;
				q.add(new int[] { cur[0] - 1, cur[1] + 1 });
			}
			
		}
		System.out.println(chk[k]);
		System.out.println(cnt);
	}
}
