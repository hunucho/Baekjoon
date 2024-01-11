import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean [] socks = new boolean [10];
		for (int i = 0; i < 5; i++) {
			int n=sc.nextInt();
			socks[n]=!socks[n];
		}
		for(int i=0;i<10;i++)
			if(socks[i])
				System.out.println(i);
	}
}
