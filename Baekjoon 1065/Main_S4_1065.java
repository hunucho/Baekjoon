package silver;

import java.util.Scanner;

public class Main_S4_1065 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),cnt=0;
		Main_S4_1065 m=new Main_S4_1065();
		for(int i=1;i<=n;i++)
			if(m.x(i))
				cnt++;
		sc.close();
		System.out.println(cnt);
	}
	private boolean x(int n) {
		if(n<100)
			return true;
		if(n==1000)
			return false;
		int a=n/100, b=(n/10)%10, c=n%10;
		if(a-b==b-c)
			return true;		
		return false;
		
	}

}
