import java.util.*;

public class Main_B3_4504 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), t=0;
		while((t=sc.nextInt())>0) {
			if(t%n==0)
				System.out.printf("%d is a multiple of %d.\n",t, n);
			else
				System.out.printf("%d is NOT a multiple of %d.\n",t, n);
		}
	}
}
