package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B3_10952 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String temp="";
		while((temp=br.readLine())!=null) {
			
			st = new StringTokenizer(temp);
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			if(a+b==0)
				return;
			System.out.println(a+b);
		}		
	}
}
