import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			int K=sc.nextInt();
			boolean ans=true;
			while(K!=1) {
				if(K%2==1)
					break;
				K/=2;
			}
			if(K==1)
				ans=false;
			System.out.println(ans?"Gazua":"GoHanGang");
		}		
	}
}
