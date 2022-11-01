import java.util.*;

public class Main_B3_2566 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int m=-1,x=-1,y=-1,t;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				t=sc.nextInt();
				if(m<t) {
					m=t;
					x=i;
					y=j;
				}
			}
		}
		System.out.println(m+"\n"+x+" "+y);
	}
}
