import java.util.*;

public class Main {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		long a=sc.nextLong(), b=sc.nextLong(), ans=0;
		if(a>b) {
			long c=a;
			a=b;
			b=c;
			ans=b-a-1;
		} else if(a<b)
			ans=b-a-1;
		sb.append(ans+"\n");
		for(long i=a+1;i<b;i++)
			sb.append(i+" ");
		System.out.println(sb.toString());
	}
}
	
