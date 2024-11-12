import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), ans=0;
        HashSet<String> hs = new HashSet<>();
        for(int i=0;i<N;i++) {
        	String in = sc.next();
        	if(in.compareTo("ENTER")==0) {
        		ans+=hs.size();
        		hs.clear();
        	} else {
        		hs.add(in);
        	}
        }
        ans+=hs.size();
        System.out.println(ans);
    }
}
