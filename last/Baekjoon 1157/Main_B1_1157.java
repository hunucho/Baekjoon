package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_B1_1157 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = new char[26];
		int maxi=0, max=0, cnt=0;
		String input_text = br.readLine().toUpperCase();
		for(int i=0;i<input_text.length();i++) {
			arr[input_text.charAt(i)-'A']++;
			if(arr[input_text.charAt(i)-'A']>max) {
				max = arr[input_text.charAt(i)-'A'];
				maxi=input_text.charAt(i)-'A';
			}
		}
		for(int i=0;i<26;i++) {
			if(arr[i]==max)
				cnt++;
		}
		if(cnt>1)
			System.out.println("?");
		else
			
			System.out.println((char)(maxi+65));
	}

}
