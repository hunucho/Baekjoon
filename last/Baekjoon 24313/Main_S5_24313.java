import java.util.*;

public class Main_S5_24313 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1=sc.nextInt(), a0=sc.nextInt(), c=sc.nextInt(), n0=sc.nextInt();
		if(a1*n0+a0<=c*n0)
			System.out.println(1);
		else
			System.out.println(0);
	}
}