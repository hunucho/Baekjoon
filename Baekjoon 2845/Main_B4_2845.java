import java.util.Scanner;

public class Main_B4_2845 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l=sc.nextInt(), p=sc.nextInt();
		for(int i=0;i<5;i++) {
			System.out.print(sc.nextInt()-(l*p)+" ");
		}
	}
}
