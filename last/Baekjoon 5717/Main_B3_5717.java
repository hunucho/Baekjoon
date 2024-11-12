import java.util.Scanner;

public class Main_B3_5717 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a=sc.nextInt(), b=sc.nextInt();
			if(a+b==0)
				break;
			System.out.println(a+b);
		}
	}
}
