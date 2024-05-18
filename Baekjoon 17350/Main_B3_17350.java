import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        boolean ans=false;
        for(int i=0;i<N;i++) {
        	String str = br.readLine();
        	if(str.compareTo("anj")==0)
        		ans=true;
        }        
        System.out.println(ans?"뭐야;":"뭐야?");
    }
}

