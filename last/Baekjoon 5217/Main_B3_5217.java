import java.util.*;

public class Main_B3_5217 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T=sc.nextInt();
		for(int t=0;t<T;t++) {
			int n=sc.nextInt(), l=1, r=n-l;
			sb.append("Pairs for "+n+": ");
			while(l<r) {
				sb.append((l++) +" "+(r--));
				if(l<r)
					sb.append(", ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
