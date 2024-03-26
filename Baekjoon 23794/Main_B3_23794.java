import java.io.*;
import java.util.*;

class Main {
	static boolean [][] arr = new boolean [101][101];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String S1 = "@".repeat(N+2), S2="@"+" ".repeat(N)+"@";
		System.out.println(S1);
		for(int i=0;i<N;i++)
			System.out.println(S2);
		System.out.println(S1);
		
		
	}
}
