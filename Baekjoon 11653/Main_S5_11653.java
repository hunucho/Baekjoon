package silver;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main_S5_11653 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = sc.nextInt(), i = 2;
		while (n > 1) {
			if(n%i==0) {
				bw.write(i+"\n");
				n/=i;
			}
			else
				i++;
		}
		bw.close();
	}
}
