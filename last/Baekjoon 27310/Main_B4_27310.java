import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        int ans=0;
        for(char c:S.toCharArray())
            ans+=c=='_'?6:c==':'?2:1;
        System.out.println(ans);
    }
}
