import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int N=1;
		double PI=3.1415927;
		while(true) {
			double rad=sc.nextDouble();
			int rot=sc.nextInt();
			double time=sc.nextDouble(), dist=PI*rad*rot/12/5280, mph=dist/time*60*60;
			if(rot==0)
				break;
			System.out.printf("Trip #%d: %.2f %.2f\n", N++, dist, mph);
		}		
	}
}
