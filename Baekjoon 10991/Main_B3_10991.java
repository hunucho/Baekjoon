import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*n-(n-i);j++) {
				if(n%2==1  && j==1)
					continue;
				else if((i+j)%2==1 && i+j>n)
					sb.append("*");
				else
					sb.append(" ");
			}
			sb.append("\n");
		}			
		System.out.println(sb.toString());
	}
}
