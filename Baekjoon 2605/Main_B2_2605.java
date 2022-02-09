package bronze;

import java.util.LinkedList;
import java.util.Scanner;

public class Main_B2_2605 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> student = new LinkedList<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int loc=sc.nextInt();
			student.add(loc, i+1);
		}
		for(int i=0;i<n;i++)
			System.out.print(student.pollLast()+" ");
	}

}
