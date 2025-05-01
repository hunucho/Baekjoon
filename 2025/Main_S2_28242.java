import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int [] ret = f(N);
        for(int ele:ret)
            System.out.print(ele+" ");
    }

    public static int [] f(int n){
        for(int a=-n;a<=n;a++){
            if(a==0 || n%a!=0)
                continue;
            int c=n/a;
            for(int b=-n-2;b<=n+2;b++) {
                if (b==0 || (-n - 2) % b != 0)
                    continue;
                int d = (-n-2)/b;
                if (a * d + b * c == n + 1 && d * b == -n - 2)
                    return new int[]{a, b, c, d};
            }
        }
        return new int [] {-1};
    }
}