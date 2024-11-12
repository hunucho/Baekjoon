import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Q=Integer.parseInt(br.readLine());
        for(int i=0;i<Q;i++) {
        	int a=Integer.parseInt(br.readLine());
        	
    		System.out.println((a&(-a))==a?1:0);
        
        }        
    }
}

