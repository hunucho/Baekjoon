import java.util.*;

public class Main_B3_10886 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), cnt=0;
		for(int i=0;i<n;i++)
			cnt+=sc.nextInt();
		if(cnt*2>n)
			System.out.println("Junhee is cute!");
		else
			System.out.println("Junhee is not cute!");
	}
}
