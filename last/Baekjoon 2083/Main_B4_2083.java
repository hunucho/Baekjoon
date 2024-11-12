package bronze;

import java.io.*;
import java.util.*;

public class Main_B4_2083 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int age = Integer.parseInt(st.nextToken()), weight= Integer.parseInt(st.nextToken());
			if(name.equals("#")&&age+weight==0)
				break;
			if(age>17 || weight>=80)
				System.out.println(name + " Senior");
			else
				System.out.println(name + " Junior");
		}
	}
}
