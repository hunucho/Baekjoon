import java.io.*;

public class Main_B1_11655 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		for(int i=0;i<s.length();i++) {
			char tmp=s.charAt(i);
			if(Character.isUpperCase(tmp))
				System.out.print((char)((tmp-'A'+13)%26+'A'));
			else if(Character.isLowerCase(tmp))
				System.out.print((char)((tmp-'a'+13)%26+'a'));
			else
				System.out.print(tmp);
		}
	}
}
