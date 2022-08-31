import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int j;
			for(j=1;j<=n-i;j++)
				System.out.print(" ");
			System.out.print("*");
			
			for(;j<n;j++)
				System.out.print(" ");
			
			for(j=2;j<i;j++)
				System.out.print(" ");
			if(i!=1)
				System.out.print("*");
			System.out.println();
		}
	}
}
