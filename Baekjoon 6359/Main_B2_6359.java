import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++){
            int n=sc.nextInt(), ans=0;
            for(int i=1;i<= Math.pow(n,0.5);i++)
                if(i*i<=n)
                    ans++;
            System.out.println(ans);
        }
    }
}