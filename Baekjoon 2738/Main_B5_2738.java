import java.util.*;

public class Main_B5_2738 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), m=sc.nextInt();
		int [][] arr = new int[n][m];
		for(int k=0;k<2;k++)
			for(int i=0;i<n;i++)
				for(int j=0;j<m;j++)
					arr[i][j]+=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}
}
