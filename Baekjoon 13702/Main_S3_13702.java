import java.io.*;
import java.util.*;

class Main {
    static int [] arr;
    static int N, K;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        K=sc.nextInt();
        arr = new int [N];
        int max=0;
        for(int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }
        System.out.println(binarySeach(max));
    }

    public static long binarySeach (long r){
        long l=0;
        while(l<=r){
            long m=(l+r)/2;
            if(m==0)
                return r;
            int cnt=0;
            for(int i=0;i<N;i++)
                cnt+=arr[i]/m;
            if(cnt<K)
                r=m-1;
            else
                l=m+1;
        }
        return r;
    }
}