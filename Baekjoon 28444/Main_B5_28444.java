import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int H=sc.nextInt(), I=sc.nextInt(), A=sc.nextInt(), R=sc.nextInt(), C=sc.nextInt();
        int a=H*I, b=A*R*C;
        System.out.println(a-b);
    }
}