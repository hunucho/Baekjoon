import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), T=sc.nextInt(), C=sc.nextInt(), P=sc.nextInt(), ans=0;
        for(int i=1+T;i<=N;i+=T)
            ans+=C*P;
        System.out.println(ans);
    }
}
