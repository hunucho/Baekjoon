package bronze;

import java.util.*;

public class MAin_B1_1236 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), M=sc.nextInt();
		int tmpi=0, tmpj=0;
		char [][] map = new char [N][M];
		for(int i=0;i<N;i++)
			map[i]=sc.next().toCharArray();
		for(int i=0;i<N;i++)
			for(int j=0;j<M;j++)
				if(map[i][j]=='X') {
					tmpi++;
					break;
				}
		for(int j=0;j<M;j++)
			for(int i=0;i<N;i++)
				if(map[i][j]=='X') {
					tmpj++;
					break;
				}
		System.out.println(Math.max(N-tmpi, M-tmpj));
		
	}
}
