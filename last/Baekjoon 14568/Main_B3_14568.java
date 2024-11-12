import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), ans=0;
        for(int A=2;A<=N;A+=2) {
        	for(int B=1;B<=N-A;B++) {
        		for(int C=B+2;C<=N-A-B;C++) {
        			if(A+B+C>N)
        				break;
        			else if(A+B+C==N) {
        				System.out.printf("%d %d %d\n",A,B,C);
        				ans++;
        			}
        		}
        	}
        }
        System.out.println(ans);
    }
}

