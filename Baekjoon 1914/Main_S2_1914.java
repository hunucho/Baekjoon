package silver;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Main_S2_1914 {
	static int n;
	static BigInteger cnt = new BigInteger("1");
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static String str = "";

	public static void hanoi(int k, int from, int temp, int to) throws IOException {
		if (k == 0)
			return;
		hanoi(k - 1, from, to, temp);

		str = from + " " + to + "\n";
		bw.write(str);

		hanoi(k - 1, temp, from, to);
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=0;i<n;i++)
			cnt=cnt.multiply(new BigInteger("2"));
		cnt=cnt.subtract(new BigInteger("1"));
		System.out.println(cnt);
		if (n <= 20) {
			hanoi(n, 1, 2, 3);
			bw.close();
		}
	}
}
