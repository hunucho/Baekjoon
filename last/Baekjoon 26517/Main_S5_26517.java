import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long k=sc.nextInt(), a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt();
		if(a*k+b==c*k+d)
			System.out.println("Yes "+(c*k+d));
		else
			System.out.println("No");
	}
}
