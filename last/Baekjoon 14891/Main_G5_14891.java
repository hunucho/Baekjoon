import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean[][] gears = new boolean[6][8]; // S = true, N = false
		
		for (int i = 1; i <= 4; i++) {
			String tmp = sc.next();
			for (int j = 0; j < 8; j++) {
				if (tmp.charAt(j) == '1')
					gears[i][j] = true;
			}
		}
		
		int K = sc.nextInt(), ans = 0;
		int[] top = new int [6]; 	// 전체 톱니에 대한 정보를 관리하지 않고, 상단 톱니만 관리해 상대적으로 다른 톱니들의 상태를 구함
		
		for (int i = 0; i < K; i++) {
			int gear = sc.nextInt(), dir = sc.nextInt();
			int [] add = new int [6];		// 회전하는 것을 체크하며 회전 방향을 저장
			
			add[gear] += dir;
			// 3번기어가 반시계방향으로 돌면 인접한 2번, 4번 기어들은 시계방향으로 돌게된다. tmpDir을 이용하여 회전방향을 바꿔준다.
			for(int j=gear+1, tmpDir = -1 * dir;j<=4;j++, tmpDir*=-1) {
				// 톱니가 8개니까 +2릃 하고 8로 나머지를 구하면 우측과 인접한 톱니, +6을 하고 8로 나머지를 구하면 좌측과 인접한 톱니 번호이다.
				if(gears[j-1][(top[j-1]+2)%8] == gears[j][(top[j]+6)%8])
					break;				// 인접한 극이 동일하면 멈춤
				else
					add[j] = tmpDir;	// 다르면 add에 회전방향을 저장
			}
			for(int j=gear-1, tmpDir = -1 * dir;j>=1;j--, tmpDir*=-1) {
				if(gears[j][(top[j]+2)%8] == gears[j+1][(top[j+1]+6)%8])
					break;
				else
					add[j] = tmpDir;
			}
			
			// 회전은 톱니 회전이 전체 일어난 후에 실제로 생기기에 가장 마지막에 톱니의 상태를 변화시킴
			for(int j=1;j<=4;j++)
				top[j] = (top[j] + 8 - add[j])%8;
			// 시계방향일 경우 2->3, 7->0, 6->7 이런 형태로 가기에 (cur+1)%8값이다. 여기서 한번 더 돌면 (cur+8+1)%8이 되니까 이런 형태를 만듦
			// 반시계일 경우 0->7, 4->3, 7->6 이런 형태이기에 (cur+9)%8의 형태로 회전을 시킴
		}
		for (int i = 1, score = 1; i <= 4; i++, score *= 2) {
			if (gears[i][top[i]])
				ans += score;
		}
		System.out.println(ans);
	}
}
