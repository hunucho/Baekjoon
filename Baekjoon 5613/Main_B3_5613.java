import java.util.Scanner;

public class Main_B3_5613 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans=sc.nextInt();
		while(true) {
			sc.nextLine();
			char op=sc.nextLine().charAt(0);
			if(op=='=')
				break;
			int n=sc.nextInt();
			switch(op){
				case '+':ans+=n; break;
				case '-':ans-=n; break;
				case '*':ans*=n; break;
				case '/':ans/=n; break;
			}
		}
		System.out.println(ans);
	}
}
