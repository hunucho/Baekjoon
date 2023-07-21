import java.util.*;

class Main_S5_15312 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A=sc.nextLine(),B=sc.nextLine();
		int len=A.length();
		int [] stroke = new int [] {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
		int [][] dp = new int [len*2][len*2];
		for(int i=0;i<len;i++)
			dp[0][i*2]=stroke[A.charAt(i)-'A'];
		for(int i=0;i<len;i++)
			dp[0][i*2+1]=stroke[B.charAt(i)-'A'];
		
		for(int i=1;i<len*2-1;i++) {
			for(int j=0;j<len*2-i;j++)
				dp[i][j]=(dp[i-1][j]+dp[i-1][j+1])%10;
		}
		System.out.println(dp[(len-1)*2][0]+""+dp[(len-1)*2][1]);
	}
}
