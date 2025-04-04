import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt(), B=sc.nextInt(), C=sc.nextInt(), X=sc.nextInt(), Y=sc.nextInt();
        int cnt=Math.min(X, Y), ans=0;
        if(2*C<A+B)
            ans = 2*C*cnt;
        else
            ans = (A+B)*cnt;
        if(cnt==Y)
            ans+=Math.min((X-cnt)*A, (X-cnt)*2*C);
        else
            ans+=Math.min((Y-cnt)*B, (Y-cnt)*2*C);
        System.out.println(ans);
    }
}