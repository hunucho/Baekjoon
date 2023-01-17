import java.util.*;

public class Main_B1_4796 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int cnt=1;
		while(true) {
			int L=sc.nextInt(), P=sc.nextInt(), V=sc.nextInt(), ans=0;
			if(L+P+V==0)
				break;
			int p=V/P, q=V-p*P;
			ans=p*L+Math.min(q, L);
			System.out.println("Case "+cnt+++": "+ans);
		}
	}
}
	
