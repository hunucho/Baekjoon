import java.util.*;

class Main_B2_1408 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A=sc.nextLine(), B=sc.nextLine();
		int [] T = new int [] {3600, 60, 1};
		int a=0, b=0, i=0;
		for(String s:A.split(":"))
			a+=T[i++]*Integer.parseInt(s);
		i=0;
		for(String s:B.split(":"))
			b+=T[i++]*Integer.parseInt(s);
		if(b<a)
			b+=86400;
		int t=b-a;
		System.out.printf("%02d:%02d:%02d",t/3600, (t%3600)/60, t%60);
	}
}
