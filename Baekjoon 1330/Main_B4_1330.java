package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B4_1330 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()) , b=Integer.parseInt(st.nextToken());
		if(a<b) System.out.println("<");
		else if(a==b) System.out.println("==");
		else if(a>b) System.out.println(">");
	}
}
