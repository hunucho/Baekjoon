import java.io.*;
import java.math.BigInteger;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BigInteger A=sc.nextBigInteger(), B=sc.nextBigInteger();
		if(A.compareTo(BigInteger.ZERO) == -1 && B.compareTo(BigInteger.ZERO) == -1) {
			System.out.println((A.divide(B)).add(BigInteger.ONE));
			System.out.println((A.remainder(B)).subtract(B));
		}else if(A.compareTo(BigInteger.ZERO) == -1 && B.compareTo(BigInteger.ZERO) == 1){
			System.out.println((A.divide(B)).subtract(BigInteger.ONE));
			System.out.println((A.remainder(B)).add(B));
		}else {
			System.out.println(A.divide(B));
			System.out.println(A.remainder(B));
		}
	}
}
