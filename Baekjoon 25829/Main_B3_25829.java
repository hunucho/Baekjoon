import java.util.*;

public class Main_B3_25829 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), s1=0, s2=0, c1=0, c2=0, ans=0;
		for(int i=0;i<n;i++) {
			int e=sc.nextInt(),v1=sc.nextInt(), v2=sc.nextInt();
			c1+=v1;
			c2+=v2;
			if(c1>c2)
				s1+=e;
			else if(c1<c2)
				s2+=e;
		}
		if(s1>s2 && c1>c2)
			ans=1;
		if(s1<s2 && c1<c2)
			ans=2;
		System.out.println(ans);
	}
}
