import java.io.*;
import java.util.*;

class Main {
    static int [] X;
    static int N, K;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        K=sc.nextInt();
        X = new int [N];
        int min=Integer.MAX_VALUE, max=0;
        for(int i=0;i<N;i++) {
            X[i] = sc.nextInt();
            min = Math.min(min, X[i]);
            max = Math.max(max, X[i]);
        }
        System.out.println(binarySeach(min, Integer.MAX_VALUE));
    }

    public static long binarySeach (long l, long r){
        while(l<=r){
            long k=K;
            long m=(l+r)/2;
            for(int i=0;i<N;i++)
                if(X[i]<m)
                    k-=m-X[i];
            if(k>=0)
                l=m+1;
            else
                r=m-1;
        }
        return r;
    }
}