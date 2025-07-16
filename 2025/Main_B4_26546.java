import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++) {
            String S = sc.next();
            int from = sc.nextInt(), to = sc.nextInt();
            System.out.print(S.substring(0, from)+ S.substring(to));
        }
    }
}