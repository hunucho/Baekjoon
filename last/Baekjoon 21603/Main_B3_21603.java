import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), K=sc.nextInt();
		StringBuilder sb= new StringBuilder();
		int cnt=0;
		for(int i=1;i<=N;i++) {
			if(i%10!=K%10 && i%10!=(2*K)%10) {
				sb.append(i).append(" ");
				cnt++;
			}
		}
		System.out.println(cnt+"\n"+sb.toString());
	}
}
