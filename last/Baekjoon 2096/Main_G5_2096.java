import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int [][] arr = new int [N][5], Small = new int [N][5], Big = new int [N][5];
		for(int i=0;i<N;i++) {
			Arrays.fill(Small[i], 1000000);
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1;j<=3;j++)
				arr[i][j]=Integer.parseInt(st.nextToken());
		}
		for(int i=1;i<=3;i++)
			Big[N-1][i]=Small[N-1][i]=arr[N-1][i];

		
		for(int i=N-1;i>0;i--) {
			for(int j=1;j<=3;j++) {
				for(int k=j-1;k<j+2;k++) {
					Small[i-1][j]=Math.min(Small[i-1][j], arr[i-1][j]+Small[i][k]);
					Big[i-1][j]=Math.max(Big[i-1][j], arr[i-1][j]+Big[i][k]);
				}
			}
		}			
		
		int max=Big[0][1], min=Small[0][1];
		for(int i=1;i<=3;i++) {
			max=Math.max(max, Big[0][i]);
			min=Math.min(min, Small[0][i]);
		}
		System.out.print(max+" "+min);
	}
}
