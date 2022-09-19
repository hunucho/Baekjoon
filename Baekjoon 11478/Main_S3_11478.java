import java.util.*;

public class Main_S3_11478 {
	public static void main(String[] args) {
		String s=new Scanner(System.in).nextLine();
		HashSet<String> hs = new HashSet<>();
		for(int i=0;i<s.length();i++)
			for(int j=i;j<s.length();j++)
				hs.add(s.substring(i,j+1));
		System.out.println(hs.size());
	}
}
