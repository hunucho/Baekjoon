import java.util.*;

public class Main_B2_10820 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			int l=0,u=0,n=0,s=0;
			for(int i=0;i<str.length();i++) {
				char ch = str.charAt(i);
				if(Character.isLowerCase(ch))
					l++;
				else if(Character.isUpperCase(ch))
					u++;
				else if(Character.isDigit(ch))
					n++;
				else if(Character.isSpaceChar(ch))
					s++;				
			}
			System.out.println(l+" "+u+" "+n+" "+s);
		}
	}
}
