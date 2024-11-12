import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), H=sc.nextInt(), V=sc.nextInt();
        System.out.println(Math.max(N-H, H)* Math.max(N-V,V)*4);
    }
}