package bronze;

import java.util.Scanner;

public class Main_B1_2563 {

	public static void main(String[] args) {
		boolean [][] map= new boolean[111][111];
		Scanner sc = new Scanner(System.in)	;
		int n=sc.nextInt();
		for(int k=0;k<n;k++)
		{
			int x=sc.nextInt(), y=sc.nextInt();
			for(int i=1;i<=10;i++)
				for(int j=1;j<=10;j++)
					map[x+i][y+j]=true;
		}
		int cnt=0;
		for(int i=1;i<=100;i++)
			for(int j=1;j<=100;j++)
				if(map[i][j])
					cnt++;
		System.out.println(cnt);
	}

}
