import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++) {
        	int N=sc.nextInt(), D=sc.nextInt(), ans=0;
        	for(int i=0;i<N;i++) {
        		int V = sc.nextInt(), F = sc.nextInt(), C = sc.nextInt();
        		if(D<=V*F/C)
        			ans++;        		
        	}
        	System.out.println(ans);
        }
    }
}
