package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_B1_1259 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			Boolean chk=true;
			String temp=br.readLine();
			if(temp.compareTo("0")==0)
				return;
			for(int i=0;i<temp.length();i++) {
				if(temp.charAt(i)!=temp.charAt(temp.length()-i-1))
					chk=false;
			}
			if(chk)
				System.out.println("yes");
			else
				System.out.println("no");
			
		}
	}

}
