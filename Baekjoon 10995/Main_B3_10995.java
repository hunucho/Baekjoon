import java.util.*;

public class Main_B3_10995 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(i%2==1)
				sb.append(" ");
			for(int j=0;j<n;j++)
				sb.append("* ");			
			sb.append("\n");
		}			
		System.out.println(sb.toString());
	}
}
