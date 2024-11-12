import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		StringBuilder S=new StringBuilder(sc.nextLine()), T=new StringBuilder(sc.nextLine());
		while(S.length()<T.length()) {
			if(T.charAt(T.length()-1)=='A')
				T.setLength(T.length()-1);
			else if(T.charAt(T.length()-1)=='B') {
				T.setLength(T.length()-1);
				T.reverse();
			}
		}
		System.out.println(S.toString().compareTo(T.toString())==0?1:0);
	}
}
