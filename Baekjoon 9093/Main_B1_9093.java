import java.util.*;

public class Main_B1_9093 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			while(st.hasMoreTokens()) {
				StringBuffer sb = new StringBuffer(st.nextToken());
				System.out.print(sb.reverse()+" ");
			}
			System.out.println();
		}
	}
}
