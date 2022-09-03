import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s=sc.nextInt(), d=sc.nextInt();
		if((s+d)%2==1 || s<d)
			System.out.println("-1");
		else		
			System.out.println(((s+d)/2)+" "+ ((s+d)/2-d));
	}
}
