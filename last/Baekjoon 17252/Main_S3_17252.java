import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long N=sc.nextLong(), tmp=1;
    	if(N==0) {
    		System.out.println("NO");
    		return;
    	}
    	int degree=0;
    	while(tmp<Integer.MAX_VALUE && tmp<N) {
    		tmp*=3;
    		degree++;
    	}
    	for(int i=degree; i>=0; i--)
    		if(N>=Math.pow(3, i))
    			N-=Math.pow(3, i);
    	System.out.println(N==0?"YES":"NO");
    }
}
