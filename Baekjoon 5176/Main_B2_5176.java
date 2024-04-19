import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K=sc.nextInt();
        for(int k=0;k<K;k++) {
        	int P=sc.nextInt(), M=sc.nextInt(), ans=0;
        	boolean [] seat = new boolean [M+1];
        	for(int i=0;i<P;i++) {
        		int tmp=sc.nextInt();
        		if(!seat[tmp]) {
        			seat[tmp]=true;
        		} else {
        			ans++;
        		}
        	}
        	System.out.println(ans);
        }
    }
}
