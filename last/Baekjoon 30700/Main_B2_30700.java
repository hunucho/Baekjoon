import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans=0;
		String S=sc.next(), C="KOREA";
		for(char ch:S.toCharArray())
			if(ch==C.charAt(ans%5))
				ans++;
		System.out.println(ans);
	}
}
