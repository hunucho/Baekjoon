import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt(), w=sc.nextInt(), m=sc.nextInt();
        System.out.printf("%d", (int)Math.ceil((double)( w - k) / m));
    }
}