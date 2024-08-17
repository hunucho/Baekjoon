import java.io.*;
import java.math.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), M=sc.nextInt();
        HashSet<Integer> [] hs = new HashSet[N+1];
        for(int i=0;i<=N;i++)
            hs[i]=new HashSet<>();
        for(int i=0;i<M;i++){
            int A=sc.nextInt(), B=sc.nextInt();
            hs[A].add(B);
            hs[B].add(A);
        }
        for(int i=1;i<=N;i++)
            System.out.println(hs[i].size());
    }
}