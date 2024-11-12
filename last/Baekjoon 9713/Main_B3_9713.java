import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++) {
        	int N=sc.nextInt(), ans=0;
        	for(int i=1;i<=N;i++)
        		if(i%2==1)
        			ans+=i;
        	System.out.println(ans);
        }
    }
}
