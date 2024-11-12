package bronze;

import java.io.*;

public class Main_B4_15372 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while (T > 0) {
			long d = Long.parseLong(br.readLine());
			System.out.println(Math.multiplyExact(d, d));	 
			T--;
		}
	}
}
