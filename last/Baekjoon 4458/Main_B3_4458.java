import java.util.*;

public class Main_B3_4458 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String tmp=sc.nextLine();
			System.out.print(Character.toUpperCase(tmp.charAt(0)));
			System.out.println(tmp.substring(1)+" ");
		}
	}
}
