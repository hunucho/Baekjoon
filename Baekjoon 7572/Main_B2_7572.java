import java.util.*;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		String gan = "6789012345", gap = "IJKLABCDEFGH";
		System.out.println(gap.charAt(N%12)+""+gan.charAt(N%10));
	}
}
