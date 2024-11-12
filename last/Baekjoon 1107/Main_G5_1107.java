import java.util.*;

public class Main {
	static boolean [] broken = new boolean [10];
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N=sc.nextInt(), M=sc.nextInt(), ans=Math.abs(N-100);
    	for(int i=0;i<M;i++)
    		broken[sc.nextInt()]=true;
    	for(int i=0;i<=999999;i++)
    		if(isPossible(i))
    			ans=Math.min(String.valueOf(i).length()+Math.abs(N-i), ans);
    	System.out.println(ans);
    	
    }
    
    public static boolean isPossible(int tmp) {
    	while(true) {
    		if(broken[tmp%10])
    			return false;
    		tmp/=10;
    		if(tmp==0)
    			return true;
    	}
    }
}
