package bronze;

import java.util.Scanner;

public class Main_B1_15947 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] musics="baby sukhwan tururu turu very cute tururu turu in bed tururu turu baby sukhwan".split(" ");
		int n=sc.nextInt()-1;
		int k=n/14;
		if(musics[n%14].equals("tururu")){
			if(k<3)
				System.out.print("tu"+"ru".repeat(k+2));
			else
				System.out.print("tu+ru*"+(k+2));
		}
		else if(musics[n%14].equals("turu")) {
			if(k<4)
				System.out.print("tu"+"ru".repeat(k+1));
			else
				System.out.print("tu+ru*"+(k+1));
	 	}
		else
			System.out.print(musics[n%14]);
	}
}
