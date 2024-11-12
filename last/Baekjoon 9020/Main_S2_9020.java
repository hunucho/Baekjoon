import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		HashSet<Integer> prime = new HashSet<>();
		for(int i=1, j;i<=10000;i++) {
			boolean chk = true;
			for(j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					chk=!chk;
					break;
				}
			}
			if(chk)
				prime.add(i);
		}
		int T=Integer.parseInt(br.readLine());
		for(int t=0;t<T;t++) {
			int N=Integer.parseInt(br.readLine());
			for(int i=N/2;i>0;i--) {
				if(prime.contains(i) && prime.contains(N-i)) {
					sb.append(i+" "+(N-i)+"\n");
					break;
				}
			}
		}
		System.out.println(sb.toString());
	}
}

