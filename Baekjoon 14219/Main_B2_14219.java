import java.io.*;
import java.math.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), M=sc.nextInt();
        System.out.println((N*M)%3==0?"YES":"NO");
    }
}