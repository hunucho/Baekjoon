package bronze;

import java.util.Scanner;

public class Main_B2_5622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int cnt=0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c<='C')
				cnt+=3;
			else if(c<='F')
				cnt+=4;
			else if(c<='I')
				cnt+=5;
			else if(c<='L')
				cnt+=6;
			else if(c<='O')
				cnt+=7;
			else if(c<='S')
				cnt+=8;
			else if(c<='V')
				cnt+=9;
			else if(c<='Z')
				cnt+=10;			
		}
		System.out.println(cnt);

	}

}
