import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int T=Integer.parseInt(br.readLine());
    	for(int t=0;t<T;t++) {
    		int N=Integer.parseInt(br.readLine()), ans=8;
    		String [] mbti = new String [N];
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		if(N>32)
    			ans=0;
    		else {
	    		for(int i=0;i<N;i++)
	    			mbti[i]=st.nextToken();
	    		
	    		for(int i=0;i<N-2;i++)
	    			for(int j=i+1;j<N-1;j++)
	    				for(int k=j+1;k<N;k++) {
	    					int tmp = getDistance(mbti[i], mbti[j]) + getDistance(mbti[j], mbti[k]) + getDistance(mbti[k], mbti[i]);
	    					ans=Math.min(ans, tmp);
	    				}
    		}
    		System.out.println(ans);
    	}
    }
    
    public static int getDistance(String a, String b) {
    	int tmp=0;
    	for(int i=0;i<4;i++)
    		if(a.charAt(i)!=b.charAt(i))
    			tmp++;
    	return tmp;
    }
}
