import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0)
            System.out.println((int)Math.ceil(sc.nextDouble()/sc.nextDouble()));
    }
}