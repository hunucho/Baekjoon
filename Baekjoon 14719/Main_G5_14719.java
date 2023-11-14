import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(), W = sc.nextInt(), ans = 0;
		boolean [][] map = new boolean [W][H];
		for(int i=0;i<W;i++) {
			int tmp=sc.nextInt();
			for(int j=0;j<tmp;j++)
				map[i][j]=true;
		}
		
		int lastidx = 0;
		for(int j=0;j<H;j++) {
			boolean chk = false;
			for(int i=0;i<W;i++) {
				if(map[i][j] && !chk) {
					chk=true;
					lastidx=i;
				} else if (map[i][j] && chk) {
					for(int k=lastidx;k<i;k++)
						if(!map[k][j]) {
							map[k][j]=true;
							ans++;
						}
				}
			}
		}
		
		System.out.println(ans);
	}
}
