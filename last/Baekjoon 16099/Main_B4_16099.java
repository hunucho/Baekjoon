import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++) {
        	long a1=sc.nextLong(), a2=sc.nextLong();
        	long b1=sc.nextLong(), b2=sc.nextLong();
        	if(a1*a2>b1*b2)
        		System.out.println("TelecomParisTech");
        	else if(a1*a2<b1*b2)
        		System.out.println("Eurecom");
        	else
        		System.out.println("Tie");        	
        }		
    }
}
