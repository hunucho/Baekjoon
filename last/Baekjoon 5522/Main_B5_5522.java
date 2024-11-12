import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans=0;
		while(sc.hasNextInt())
			ans+=sc.nextInt();
		System.out.println(ans);
	}
}
