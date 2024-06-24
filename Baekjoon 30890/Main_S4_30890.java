import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X=sc.nextInt(), Y=sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=X*Y;i++) {
			if(i%X==0 && i%Y==0)
				sb.append("3");
			else if(i%X==0)
				sb.append("2");
			else if(i%Y==0)
				sb.append("1");
		}
		System.out.println(sb);
	}
}
