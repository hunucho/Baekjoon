import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), L=sc.nextInt(), ans=1;
		int [] leak = new int [N];
		for(int i=0;i<N;i++)
			leak[i] = sc.nextInt();
		Arrays.sort(leak);
		float min=(float) (leak[0]+L-0.5);
		for(int i=1;i<N;i++) {
			if(leak[i]>min) {
				ans++;
				min=(float) (leak[i]+L-0.5);
			}
		}
		System.out.println(ans);
	}	
}
