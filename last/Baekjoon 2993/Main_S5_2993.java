import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        PriorityQueue<String> pq = new PriorityQueue<>();
        for(int i=1;i<len-1;i++) {
        	for(int j=i+1;j<len;j++) {
    			String tmp = "";
    			tmp+=reverse(str.substring(0, i));
    			tmp+=reverse(str.substring(i, j));
    			tmp+=reverse(str.substring(j));
    			pq.add(tmp);
        	}
        }
        System.out.println(pq.poll());
    }
    
    public static String reverse (String str) {
    	String ret = "";
    	for(int i=0;i<str.length();i++) {
    		ret+=str.charAt(str.length()-i-1);
    	}
    	return ret;
    }
}
