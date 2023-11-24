import java.text.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println( 
				new SimpleDateFormat("YYYY-MM-dd").format(new Date(114,3,sc.nextInt()+1)));
	}
}
