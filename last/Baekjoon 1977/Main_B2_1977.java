import java.util.*;

public class Main_B2_1977 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt(), n=sc.nextInt(), sum=0, min=n;
		for(int i=m;i<=n;i++) {
			int r=(int)Math.sqrt(i);
			if(r*r == i) {
				sum+=i;
				min=Math.min(min, i);
			}
		}
		System.out.println(sum==0?-1:sum+"\n"+min);
	}
}
