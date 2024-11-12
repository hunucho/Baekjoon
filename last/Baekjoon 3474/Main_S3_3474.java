import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++){
            int N=sc.nextInt(), ans=0;
            for(int i=5;i<=N;i*=5)
                ans+=N/i;
            System.out.println(ans);
        }
    }
}
