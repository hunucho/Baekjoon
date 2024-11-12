import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), n=0, cnt=0, last=0;
		for(int len=1;cnt+len<=N;len++)
			for(int i=(int)Math.pow(10, len-1);i<Math.pow(10, len) && cnt+len<N;i++) {
				cnt+=len;
				last=i;
			}
		last++;
		System.out.println(String.valueOf(last).charAt(N-cnt-1));
	}
}
