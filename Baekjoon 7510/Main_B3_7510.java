import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int [] a=new int [3];
			for(int j=0;j<3;j++)
				a[j]=sc.nextInt();
			Arrays.sort(a);
			String ans = "no";
			if(a[0]*a[0]+a[1]*a[1]==a[2]*a[2])
				ans="yes";
			System.out.println("Scenario #"+i+":\n"+ans+"\n");
		}
	}

}
