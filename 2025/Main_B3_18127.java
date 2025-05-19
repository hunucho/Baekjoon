import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt(), d=A-1;
        long ans=1, inc=A-2;
        if(B>0)
            ans=A;
        for(int i=1;i<B;i++) {
            ans += d + inc;
            d+=inc;
        }
        System.out.print(ans);
    }
}