import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        HashMap<String,Integer> RPS = new HashMap();
        RPS.put("R",0);
        RPS.put("P",1);
        RPS.put("S",2);
        for(int t=0;t<T;t++){
            int n=sc.nextInt(), cnt1=0, cnt2=0;
            for(int i=0;i<n;i++){
                String A=sc.next(), B=sc.next();
                if (RPS.get(A)==RPS.get(B))
                    continue;
                else if (RPS.get(A)==(RPS.get(B)+1)%3)
                    cnt1++;
                else
                    cnt2++;
            }
            if(cnt1>cnt2)
                System.out.println("Player 1");
            else if(cnt1<cnt2)
                System.out.println("Player 2");
            else
                System.out.println("TIE");
        }
    }
}
