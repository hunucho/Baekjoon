import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), ans=0, bonus=0;
        String S=sc.next();
        for(int i=1;i<=N;i++) {
        	char ch = S.charAt(i-1);
        	if(ch=='O')
        		ans+=i+(bonus++);
        	else
        		bonus=0;
        }
        System.out.println(ans);
    }
}
