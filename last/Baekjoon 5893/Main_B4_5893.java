import java.math.BigInteger;
import java.util.*;

public class Main_B4_5893 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n = new BigInteger(sc.nextLine(),2).multiply(new BigInteger("17"));
		System.out.println(n.toString(2));
	}
}
