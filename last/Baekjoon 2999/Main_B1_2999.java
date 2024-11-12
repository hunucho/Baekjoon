package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_B1_2999 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cipher = br.readLine();
		int len=0;
		for(int i=(int) Math.pow(cipher.length(), 0.5);i>0;i--) {
			if(cipher.length()%i==0) {
				len=i;
				break;
			}
		}
		char [][]crr =new char[cipher.length()/len][len];
		for(int i=0;i<cipher.length()/len;i++)
			for(int j=0;j<len;j++) {
				crr[i][j]=cipher.charAt(i*len+j);
			}
		for(int j=0;j<len;j++)
			for(int i=0;i<cipher.length()/len;i++) {
				System.out.print(crr[i][j]);;
			}
		
	}
}
