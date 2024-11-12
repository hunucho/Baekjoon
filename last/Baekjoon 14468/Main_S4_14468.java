import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [] c = sc.next().toCharArray();
		int [] s = new int [26], e = new int [26];
		int ans=0;
		for (int i=0;i<52;i++) {
			int idx = c[i]-'A';
			if(s[idx]==0)
				s[idx]=i+1;
			else
				e[idx]=i+1;
		}
		for(int i=0;i<26;i++)
			for(int j=0;j<26;j++)
				if(s[i]<s[j] && s[j]<e[i] && e[i]<e[j])
					ans++;
		System.out.println(ans);
	}
}
