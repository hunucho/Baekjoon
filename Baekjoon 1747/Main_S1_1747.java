import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=Math.max(2, N);i<=1111111;i++){
			if(isPrime(i) && isPalindrome(i)) {
				System.out.println(i);
				break;
			}
		}
	}
	public static boolean isPrime(int N) {
		for(int i=2;i<=Math.pow(N, 0.5);i++)
			if(N%i==0)
				return false;
		return true;
	}
	
	public static boolean isPalindrome(int N) {
		String S = Integer.toString(N);
		for(int i=0;i<S.length()/2;i++)
			if(S.charAt(i)!=S.charAt(S.length()-1-i))
				return false;
		return true;
	}
}
