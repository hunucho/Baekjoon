import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), K=sc.nextInt();
		int [][] arr = new int [N][N], brr = new int [N*K][N*K];
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++)
				arr[i][j]=sc.nextInt();
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++)
				for(int ii=0;ii<K;ii++)
					for(int jj=0;jj<K;jj++)
						brr[i*K+ii][j*K+jj]=arr[i][j];
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N*K;i++) {
			for(int j=0;j<N*K;j++) 
				sb.append(brr[i][j]).append(" ");
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
