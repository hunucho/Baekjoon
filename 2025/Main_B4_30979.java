import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt(), N=sc.nextInt();
        int sum=0;
        for(int i=0;i<N;i++)
            sum+=sc.nextInt();
        System.out.println(sum>=T?"Padaeng_i Happy":"Padaeng_i Cry");
    }
}