import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), D=0, P=0;
        for(int i=0;i<N;i++) {
            int L=sc.nextInt();
            String S=sc.next();
            System.out.println(S.repeat(L));
        }
    }
}