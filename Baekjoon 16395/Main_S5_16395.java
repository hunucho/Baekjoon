import java.util.*;

class Main_S5_16395 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), k=sc.nextInt();
		int [][] arr = new int [32][32];
		arr[1][1]=1;
		for(int i=2;i<=n;i++)
			for(int j=1;j<=i;j++)
				arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
		System.out.println(arr[n][k]);
	}
}
