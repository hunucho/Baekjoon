import java.io.*;
import java.util.*;
public class Main {
    public static long gcd(long a, long b){
        if(b==0)
            return a;
        else
            return gcd(b, a%b);
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        long A=sc.nextLong(), B=sc.nextLong();
        System.out.print("1".repeat((int) gcd(Math.max(A, B), Math.min(A, B))));
    }
}