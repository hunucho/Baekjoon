import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        int A=sc.nextInt(), B=sc.nextInt();
        int K = A-B;
        if(K>0 && A-2*K == B-K && B-K>=0){
            System.out.println("YES");
            System.out.println(K);
            for(int i=0;i<K-1;i++)
                System.out.println("aba");
            System.out.print("aba");
            for(int i=0;i<B-K;i++)
                System.out.print("ba");
        } else
            System.out.println("NO");
    }
}