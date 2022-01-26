package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_B1_1193 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0, i = 0;
		boolean evenodd=false;
		while (cnt < n) {
			i++;
			evenodd=!evenodd;
			for (int j = 0; j < i; j++) {
				cnt++;
				if(cnt>=n)	{
					System.out.println(i+1);
					if(evenodd) {
						System.out.println(String.valueOf(i-j)+"/"+String.valueOf(j+1));
					}
					else
						System.out.println(String.valueOf(j+1)+"/"+String.valueOf(i-j));
					break;
				}					
			}			
		}		
	}
}