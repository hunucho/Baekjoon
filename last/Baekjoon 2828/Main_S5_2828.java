import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), M=sc.nextInt()-1, pos=1, ans=0;
		int J=sc.nextInt();
		for (int i = 0; i < J; i++) {
			int apple=sc.nextInt();
			if(apple<pos) {
				ans+=pos-apple;
				pos = apple;
			}
			else if(M+pos<apple) {
				ans+=apple-(M+pos);
				pos=apple-M;
			}
		}
		System.out.println(ans);
	}
}
