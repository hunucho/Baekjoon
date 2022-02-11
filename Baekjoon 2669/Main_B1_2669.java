package bronze;

import java.util.Scanner;

public class Main_B1_2669 {

	public static void main(String[] args) {
		boolean [][] map = new boolean [101][101];
		Scanner sc = new Scanner(System.in);
		for(int k=0;k<4;k++) {
			int si=sc.nextInt(), sj=sc.nextInt(),ei=sc.nextInt(), ej=sc.nextInt();
			for(int i=si+1;i<=ei;i++)
				for(int j=sj+1;j<=ej;j++)
					map[i][j]=true;			
		}
		int cnt=0;
		for(int i=1;i<=100;i++)
			for(int j=1;j<=100;j++)
				if(map[i][j])
					cnt++;
		System.out.println(cnt);

	}

}
