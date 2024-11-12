import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0};
        int N=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<N;i++) {
        	String S = sc.nextLine();
        	int cnt=0;
        	for(char ch : S.toCharArray())
        		cnt+=ch!=' '?arr[ch-'A']:0;
        	System.out.println(cnt);
        }        
    }
}

