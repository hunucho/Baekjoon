import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++) {
        	String A=sc.next(), B=sc.next();
        	int cnt=0;
        	for(int i=0;i<A.length();i++)
        		if(A.charAt(i)!=B.charAt(i))
        			cnt++;
        	System.out.printf("Hamming distance is %d.\n",cnt);
        }
    }
}
