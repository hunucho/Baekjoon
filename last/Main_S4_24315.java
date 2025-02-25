import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a1=sc.nextInt(), a0=sc.nextInt(), c1=sc.nextInt(), c2=sc.nextInt(), n0=sc.nextInt();
        System.out.print(c1*n0<=a1*n0+a0 && a1*n0+a0<=c2*n0?"1":"0");
    }
}