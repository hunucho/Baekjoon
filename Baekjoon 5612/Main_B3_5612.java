import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt(), ans=m, now=m;
        for(int i=0;i<n;i++){
            int in=sc.nextInt(), out=sc.nextInt();
            now+=in-out;
            ans=Math.max(ans, now);
            if(now<0) {
                ans = 0;
                break;
            }
        }
        System.out.print(ans);
    }
}
