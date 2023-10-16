import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), loc=0;
        HashSet<String> set = new HashSet<>();
        String prev, next;
        String [] S = new String[N];
        for(int i=0;i<N;i++){
            S[i]=sc.next();
            if(S[i].equals("?"))
                loc=i;
            set.add(S[i]);
        }

        prev=loc>0?S[loc-1].substring(S[loc-1].length()-1):"";
        next=loc<N-1?S[loc+1].substring(0,1):"";

        int M=sc.nextInt();
        String ans="";
        String pattern = "^"+prev+"[a-z]*"+next+"$";
        for(int i=0;i<M;i++){
            ans=sc.next();
            if(ans.matches(pattern) && !set.contains(ans))
                break;
        }
        System.out.println(ans);
    }
}
