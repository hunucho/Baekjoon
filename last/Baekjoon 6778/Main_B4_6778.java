package bronze;

import java.util.*;

public class Main_B4_6778 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),e=sc.nextInt();
		String ans="";
		if(a>=3&&e<=4)
			ans+="TroyMartian\n";
		if(a<=6&&e>=2)
			ans+="VladSaturnian\n";
		if(a<=2&&e<=3)
			ans+="GraemeMercurian\n";
		System.out.println(ans);
	}
}
