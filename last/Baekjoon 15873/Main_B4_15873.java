import java.util.*;

public class Main_B4_15873 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int c=sc.nextInt(), ans=0;
		if(c>=1000)
			ans=c/100+c%100;
		else if(c>=100) {
			if(c%10==0)
				ans=c/100+10;
			else
				ans=c%10+10;
		}
		else
			ans=c/10+c%10;
		System.out.println(ans);
	}
}
