import java.io.*;
import java.util.*;

public class Main {
	static int x, y, maxx, minx, maxy, miny ;
	static boolean ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		String S = sc.next();
		ans = false;
		for(int i=0;i<K;i++) {
			move(S);
			if(ans || !(minx<=0 && 0<=maxx && miny<=0 && 0<=maxy))
				break;
			minx=miny=Integer.MAX_VALUE;
			maxx=maxy=Integer.MIN_VALUE;
		}
		System.out.println(ans ? "YES" : "NO");
	}
	
	public static void move(String S) {
		// 문자가 주어짐에 따라서 x, y 좌표를 이동하며 x, y의 범위를 찾는다 (우측 위 최대값, 좌측 및 최소값)
		// x, y범위안에 (0,0)이 있다면 이동하는 범위는 원점을 지날 수 있는 가능성이 있지만
		// 원점이 존재하지 않는다면 특정 방향으로 지속적으로 멀어진다는 의미이기에 종료시킨다.
		for (char ch : S.toCharArray()) {
			switch (ch) {
			case 'U':
				y++;
				break;
			case 'D':
				y--;
				break;
			case 'L':
				x--;
				break;
			case 'R':
				x++;
				break;
			}
			maxx=Math.max(x, maxx);
			minx=Math.min(x, minx);
			maxy=Math.max(y, maxy);
			miny=Math.min(y, miny);
			if(x==0 && y==0)
				ans=true;
		}
	}
}
