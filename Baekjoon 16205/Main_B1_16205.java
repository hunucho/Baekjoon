import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		String S=sc.next();
		StringBuilder sb = new StringBuilder();
		
		if(N==1) {
			sb.append(S).append("\n");
			sb.append(CtoS(S)).append("\n");
			sb.append(Character.toUpperCase(S.charAt(0))+S.substring(1)).append("\n");
		} else if(N==2) {
			String tmp = StoC(S);
			sb.append(tmp).append("\n");
			sb.append(S).append("\n");
			sb.append(Character.toUpperCase(tmp.charAt(0))+tmp.substring(1));
			
			
		} else if(N==3) {
			sb.append(Character.toLowerCase(S.charAt(0))+S.substring(1)).append("\n");
			sb.append(PtoS(S)).append("\n");
			sb.append(S);
		}
		System.out.println(sb.toString());
	}
	
	public static String CtoS(String S) {
		String str = "";
		for(char ch:S.toCharArray()) {
			if(Character.isUpperCase(ch))
				str+="_"+Character.toLowerCase(ch);
			else
				str+=ch;
		}
		return str;
	}
	
	public static String StoC(String S) {
		String str = "";
		boolean chk=false;
		for(char ch:S.toCharArray()) {
			if(ch=='_')
				chk=true;
			else {
				str+=chk?Character.toUpperCase(ch):ch;
				chk=false;
			}
		}
		return str;
	}
		
	public static String PtoS(String S) {
		String str = "" + Character.toLowerCase(S.charAt(0));
		for(int i=1;i<S.length();i++) {
			char ch=S.charAt(i);
			if(Character.isUpperCase(ch))
				str+="_"+Character.toLowerCase(ch);
			else
				str+=ch;
		}
		return str;
	}
	
}
