package bronze;

import java.util.Scanner;

public class Main_B1_10163 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] map=new int[1002][1002];
		int n= sc.nextInt();
		int [] ans=new int[n+1];
		for(int i=1;i<=n;i++) {
			int sx=sc.nextInt(), sy=sc.nextInt(), ex=sc.nextInt(), ey=sc.nextInt();
			for(int x=sx;x<sx+ex;x++)
				for(int y=sy;y<sy+ey;y++)
					map[x][y]=i;
		}
		for(int i=0;i<1002;i++)
			for(int j=0;j<1002;j++)
				ans[map[i][j]]++;
		for(int i=1;i<=n;i++)
			System.out.println(ans[i]);
	}
}