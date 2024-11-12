import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int s=0,t,i;
		for(i=0;i<5;i++) {
			t=sc.nextInt();
			s+=t<40?40:t;
		}
		System.out.println(s/5);
	}
}
