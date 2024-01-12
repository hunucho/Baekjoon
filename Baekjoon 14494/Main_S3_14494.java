import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long [][] D = new long [1002][1002];
		int n=sc.nextInt(), m=sc.nextInt();
		D[0][0]=1;
		for(int i=1;i<=1000;i++)
			for(int j=1;j<=1000;j++)
				D[i][j]=(D[i-1][j]+D[i][j-1]+D[i-1][j-1])%1000000007;
		System.out.println(D[n][m]);
	}
}
