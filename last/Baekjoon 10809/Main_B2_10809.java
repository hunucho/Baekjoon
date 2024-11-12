package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_B2_10809 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		Arrays.fill(arr, -1);
		String t=br.readLine();
		for(int i=0;i<t.length();i++) {
			if(arr[t.charAt(i)-'a']==-1)
				arr[t.charAt(i)-'a']=i;
		}
		for(int i=0;i<26;i++)
			System.out.print(arr[i]+" ");
		
	}

}
