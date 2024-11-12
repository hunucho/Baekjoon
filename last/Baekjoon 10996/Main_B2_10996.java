import java.util.*;

public class Main_B2_10996 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<2*n;i++) {
			for(int j=0;j<n;j++)
				System.out.print((i+j)%2==0?"*":" ");
			System.out.println();
		}
	}
}
