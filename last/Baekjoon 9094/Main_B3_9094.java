import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++){
            int n=sc.nextInt(), m=sc.nextInt(), ans=0;
            for(int a=1;a<n-1;a++)
                for (int b = a + 1; b < n; b++)
                    if ((a * a + b * b + m) % (a * b) == 0)
                        ans++;
            System.out.println(ans);
        }
    }
}
