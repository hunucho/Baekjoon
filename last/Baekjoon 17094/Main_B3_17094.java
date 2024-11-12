import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int len=sc.nextInt();
        String s=sc.next();
        int cnt2=0, cnte=0;
        for(int i=0;i<len;i++) {
        	if(s.charAt(i)=='2')
        		cnt2++;
        	else
        		cnte++;
        }
        System.out.println(cnt2==cnte?"yee":cnt2>cnte?"2":"e");
    }
}
