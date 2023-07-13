import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine()), d=0;
		int [] trees = new int [N];
		for(int i=0;i<N;i++)
			trees[i]=Integer.parseInt(br.readLine());
		Arrays.sort(trees);
		for(int i=1;i<N;i++) {
			d=gcd(Math.max(d,trees[i]-trees[i-1]),Math.min(d,trees[i]-trees[i-1]));
		}
		System.out.println((trees[N-1]-trees[0])/d-N+1);
	}
	public static int gcd(int a, int b) {
		while(b!=0) {
			int c=a%b;
			a=b;
			b=c;
		}
		return a;
	}
}
