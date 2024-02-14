import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), M=sc.nextInt(), K=sc.nextInt();
        System.out.println(K/M+" "+K%M);
    }
}