package bronze;

import java.util.Scanner;

public class Main_B3_15953 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++) {
			int tmp=sc.nextInt(), ans=0;
			if(tmp==0)
				ans=0;
			else if(tmp<2)
				ans+=500;
			else if(tmp<4)
				ans+=300;
			else if(tmp<7)
				ans+=200;
			else if(tmp<11)
				ans+=50;
			else if(tmp<16)
				ans+=30;
			else if(tmp<22)
				ans+=10;
			tmp=sc.nextInt();
			if(tmp==0)
				ans+=0;
			else if(tmp<2)
				ans+=512;
			else if(tmp<4)
				ans+=256;
			else if(tmp<8)
				ans+=128;
			else if(tmp<16)
				ans+=64;
			else if(tmp<32)
				ans+=32;
			System.out.println(ans*10000);
		}
	}
}
