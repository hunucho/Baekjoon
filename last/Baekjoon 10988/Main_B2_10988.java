import java.util.*;

public class Main_B2_10988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int len=str.length(), cnt=0;
		for(int i=0;i<len/2;i++)
			if(str.charAt(i)==str.charAt(len-i-1))
				cnt++;
		System.out.println(cnt==len/2?1:0);
	}
}
