import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc= new Scanner(System.in);
        while(true){
            int ans=0;
            int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt();
            if(a==0 && b==0 && c==0 && d==0)
                break;
            while(a!=b || a!=c|| a!=d) {
                ++ans;
                int tmp = a;
                a = Math.abs(a - b);
                b = Math.abs(b - c);
                c = Math.abs(c - d);
                d = Math.abs(d - tmp);
            }
            System.out.println(ans);
        }
    }
}