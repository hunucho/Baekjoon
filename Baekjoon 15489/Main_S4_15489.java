import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int R=sc.nextInt(), C=sc.nextInt(), W=sc.nextInt(), ans=0;
		int [][] arr = new int [31][31];
		arr[0][0]=1;
		for(int i=1;i<31;i++)
			for(int j=1;j<31;j++)
				arr[i][j]=arr[i-1][j] + arr[i-1][j-1];
		for(int i=0;i<W;i++)
			for(int j=0;j<=i;j++)
				ans+=arr[R+i][C+j];
		System.out.println(ans);
	}
}
