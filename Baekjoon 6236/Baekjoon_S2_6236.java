import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), M=sc.nextInt();
        int [] arr = new int [N];
        int L=0, R=1000000000;
        for(int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
            L=Math.max(L, arr[i]);
        }
        while(L<R){
            int K = (L+R)/2, cnt=0, T=0;
            for(int i=0;i<N;i++){
                if(T<arr[i]){
                    cnt++;
                    T=K;
                }
                    T-=arr[i];
            }
            if(cnt<=M)
                R=K;
            else
                L=K+1;
        }
        System.out.println(L);
    }
}