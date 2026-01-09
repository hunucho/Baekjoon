import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt();
        int ans=1;
        if(A%2==0 && B%2==1)
            ans = (B-A)/2 + 2;
        else
            ans += (B-A)/2 + 1;
        System.out.print(ans);
    }
}