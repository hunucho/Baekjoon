import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int dir = 0;
		char [] ans = "NESW".toCharArray();
		// 0 : N, 1 : E, 2 : S, 3 : W
		for(int i=0;i<10;i++) {
			int tmp=sc.nextInt();
			if(tmp==1)
				dir = (dir+1)%4;
			else if(tmp==2)
				dir = (dir+2)%4;
			else if(tmp==3)
				dir = (dir+3)%4;
		}
		System.out.println(ans[dir]);
	}
}
