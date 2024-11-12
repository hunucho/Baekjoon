package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_B5_10430 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a=Integer.parseInt(st.nextToken()), b=Integer.parseInt(st.nextToken()), c=Integer.parseInt(st.nextToken());
		System.out.println((a+b)%c);
		System.out.println(((a+b)%c+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
	}
}
