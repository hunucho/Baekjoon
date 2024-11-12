import java.util.Scanner;

public class Main  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s=sc.nextInt(),k=sc.nextInt(),h=sc.nextInt(),m=Math.min(Math.min(s, k), h);
		String ans="";
		if(s+k+h>99)
			ans="OK";
		else if(m==s)
			ans="Soongsil";
		else if(m==k)
			ans="Korea";
		else if(m==h)
			ans="Hanyang";
		System.out.println(ans);
	}
}
