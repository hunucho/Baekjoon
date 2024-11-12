import java.util.*;

public class Main_1371 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] cnt = new int [26];
		while(sc.hasNext()) {
			String str=sc.next();
			for(char c:str.toCharArray())
				cnt[c-'a']++;
		}
		int max = 0;
		for(int i=0;i<26;i++)
			max=Math.max(max, cnt[i]);
		for(int i=0;i<26;i++)
			if(cnt[i]==max)
				System.out.print((char)(i+'a'));
	}
}
