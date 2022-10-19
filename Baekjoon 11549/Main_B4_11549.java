import java.util.Scanner;

public class Main_B4_11549 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt(), a=0;
		for(int i=0;i<5;i++)
			if(sc.nextInt()==t)
				a++;
		System.out.println(a);			
	}
}
