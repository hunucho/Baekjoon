import java.util.*;

public class Main_B3_10992 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==n-j-1 || i==n-1)
					sb.append("*");
				else
					sb.append(" ");
			}
			for(int j=1;j<=i;j++) {
				if(j==i || i==n-1)
					sb.append("*");
				else
					sb.append(" ");
			}
			sb.append("\n");
		}			
		System.out.println(sb.toString());
	}
}
