import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), M=sc.nextInt();
        System.out.print(((N % 4 == 0 && N % 100 != 0) || N % 400 == 0) ? 30 : 29);
    }
}