package bronze;

import java.math.BigInteger;
import java.util.*;

public class Main_B5_1271 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger A=new BigInteger(sc.next()), B=new BigInteger(sc.next());
		System.out.println(A.divide(B));
		System.out.println(A.mod(B));
	}
}
