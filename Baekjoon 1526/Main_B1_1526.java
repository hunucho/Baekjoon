import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=N;i>=0;i--) {
			if(f(i)) {
				System.out.println(i);
				break;
			}
		}
	}
	
	public static boolean f(int i) {
		while(i>0) {
			if(i%10 != 4 && i%10 != 7)
				return false;
			i/=10;
		}
		return true;
	}
}
