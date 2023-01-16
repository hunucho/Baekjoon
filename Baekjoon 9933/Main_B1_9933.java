import java.util.*;

public class Main_B1_9933 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		HashSet<String> hs = new HashSet<>();
		for(int i=0;i<n;i++) {
			String tmp = sc.nextLine();
			hs.add(tmp);
			StringBuilder sb = new StringBuilder().append(tmp);
			if(hs.contains(sb.reverse().toString()))
				System.out.println(tmp.length()+" "+tmp.charAt(tmp.length()/2));
		}
	}
}
	
