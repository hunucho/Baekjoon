import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cash = sc.nextInt();
		int Bcash = cash, Tcash = cash;
		int[] arr = new int[14];
		for (int i = 0; i < 14; i++)
			arr[i] = sc.nextInt();
		int Bstock = 0, Tstock = 0;
		int inccnt = 0, deccnt = 0, last = arr[0];
		for (int i = 0; i < 14; i++) {
			Bstock += Bcash / arr[i];
			Bcash %= arr[i];
		}
		for (int i = 1; i < 14; i++) {
			if (last < arr[i]) {
				last = arr[i];
				inccnt++;
				deccnt = 0;
			} else if (last > arr[i]) {
				last = arr[i];
				deccnt++;
				inccnt = 0;
			}
			if (deccnt >= 3) {
				Tstock += Tcash / arr[i];
				Tcash %= arr[i];
			}
			if (inccnt >= 3) {
				Tcash += arr[i] * Tstock;
				Tstock = 0;
			}
		}
		int Basset = arr[13] * Bstock + Bcash, Tasset = arr[13] * Tstock + Tcash;

//		System.out.println(Basset + " " + Tasset);
		if (Basset > Tasset)
			System.out.println("BNP");
		else if (Basset < Tasset)
			System.out.println("TIMING");
		else
			System.out.println("SAMESAME");
	}
}
