import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), R=sc.nextInt(), ans=0, ansx=0, ansy=0;
		int [][] rices = new int [N][2];
		for(int i=0;i<N;i++)
			for(int j=0;j<2;j++)
				rices[i][j]=sc.nextInt();
		for(int i=-100;i<=100;i++) {
			for(int j=-100;j<=100;j++) {
				int tmp=0;
				for(int k=0;k<N;k++) {
					if(Math.sqrt(Math.pow(i-rices[k][0], 2) + Math.pow(j-rices[k][1], 2))<=R)
						tmp++;
				}
				if(tmp>ans) {
					ans=tmp;
					ansx=i;
					ansy=j;
				}
			}
		}
		System.out.println(ansx+" "+ansy);
	}
}
