import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1=sc.nextInt(), y1=sc.nextInt();
		double x2=sc.nextInt(), y2=sc.nextInt();
		double x3=sc.nextInt(), y3=sc.nextInt();
		boolean ans = true;
		
		if(x1==x2 || x2==x3 || x3==x1) {
			if(x1==x2 && x2==x3)
				ans=false;
		} else if(y1==y2 || y2==y3 || y3==y1) {
			if(y1==y2 && y2==y3)
				ans=false;
		} else {
			if((y2-y1)/(x2-x1) == (y3-y2)/(x3-x2))
				ans=false;
		}
		System.out.println(ans?"WINNER WINNER CHICKEN DINNER!":"WHERE IS MY CHICKEN?");
	}
}
