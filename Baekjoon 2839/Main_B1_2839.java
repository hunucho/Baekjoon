package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_B1_2839 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int x=-1, y=0;
		
		for(int i=n/5;i>=0;i--) {
			int temp=n;
			temp-=i*5;
			if(temp%3==0) {
				x=i;
				y=temp/3;
				break;
			}
		}
		System.out.println(x+y);
	}

}
