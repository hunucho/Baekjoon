import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println((N%7==0 || N%7==2)?"CY":"SK"); 
	}	
}
