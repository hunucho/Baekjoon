package bronze;
import java.math.*;
import java.util.*;

public class Main_B3_2935 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger A = new BigInteger(sc.nextLine());
		String op = sc.nextLine();
		BigInteger B = new BigInteger(sc.nextLine());
		switch (op) {
		case "+":
			A=A.add(B);
			break;
		case "*":
			A=A.multiply(B);
		}
		System.out.println(A.toString());
	}
}
