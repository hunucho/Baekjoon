package bronze;

import java.util.*;

public class Main_B1_1357 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder X = new StringBuilder(), Y=new StringBuilder(), Z=new StringBuilder();
		X.append(sc.nextInt());
		Y.append(sc.nextInt());
		System.out.println(Integer.parseInt(Z.append(Integer.parseInt(X.reverse().toString())+Integer.parseInt(Y.reverse().toString())).reverse().toString()));
	}
}
