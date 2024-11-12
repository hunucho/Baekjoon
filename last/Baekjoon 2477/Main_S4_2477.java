package silver;

import java.util.Scanner;

public class Main_S4_2477 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt(), lh=0, lw=0, sh=999, sw=999;
		int [][] arr= new int[6][2];
		for(int i=0;i<6;i++) {
			int dir = sc.nextInt(), len=sc.nextInt();
			arr[i][0]=dir;
			arr[i][1]=len;
			if(dir==1 || dir==2) {
				if(lw<len)
					lw=len;
			}
			if(dir==3 || dir==4) {
				if(lh<len)
					lh=len;
			}
		}
		for(int i=0;i<7;i++) {
			int t=arr[i%6][0]*10+arr[(i+1)%6][0];
			switch(t) {
			case 24:
			case 32:
			case 13:
			case 41:
				sw=arr[i%6][1];
				sh=arr[(i+1)%6][1];
			}
		}
		System.out.println((lw*lh-sw*sh)*k);
	}
}
