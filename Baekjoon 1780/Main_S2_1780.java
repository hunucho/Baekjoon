package silver;

import java.io.*;
import java.util.*;

public class Main_S2_1780 {
	static int minus, zero, plus, N;
	static int [][] arr;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int [N][N];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++)
				arr[i][j]=Integer.parseInt(st.nextToken());
		}
		f(0,0,N);
		System.out.print(minus+"\n"+zero+"\n"+plus);
	}
	public static void f(int x, int y, int size) {
		int tmp=arr[x][y];
		boolean chk=false;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(tmp!=arr[i+x][j+y]) {
					chk=true;
					break;
				}		
			}
		}
		if(chk) {
			for(int i=0;i<size;i+=size/3)
				for(int j=0;j<size;j+=size/3)
					f(x+i, y+j, size/3);
		} else {
			switch(tmp) {
			case -1:minus++; break;
			case 0:zero++; break;
			case 1:plus++; break;
			}
		}
	}
}
