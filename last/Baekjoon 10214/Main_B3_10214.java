import java.util.*;

public class Main_B3_10214 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++) {
			int y=0,k=0;
			for(int i=0;i<9;i++) {
				y+=sc.nextInt();
				k+=sc.nextInt();
			}
			System.out.println(y==k?"Draw":y>k?"Yonsei":"Korea");
		}
	}
}
