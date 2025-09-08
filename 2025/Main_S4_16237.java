import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws  Exception{
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt(), B=sc.nextInt(), C=sc.nextInt(), D=sc.nextInt(), E=sc.nextInt();
        int ans=E;
        ans+=D;
        A = Math.max(A-D, 0);
        ans+=C;
        if(C<=B) {
            B-=C;
            ans+=B/2+B%2;
            A-=B/2;
            if(B%2>0)
                A-=3;
        }
        else{
            C-=B;
            A-=C*2;
        }
        if(A>0) {
            ans += A / 5;
            ans += A % 5 > 0 ? 1 : 0;
        }
        System.out.print(ans);
    }
}