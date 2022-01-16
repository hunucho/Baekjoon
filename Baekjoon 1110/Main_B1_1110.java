package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_B1_1110 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), cnt=0, temp=0;
		temp=n;
		do {
			temp=(temp/10+temp%10)%10+(temp%10)*10;
			cnt++;
		}
		while(temp!=n);
		System.out.println(cnt);
	}

}
