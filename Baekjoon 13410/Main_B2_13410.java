import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), K=sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=1;i<=K;i++)
            pq.add(reverse(N*i));
        System.out.println(pq.poll());
    }

    public static int reverse(int N){
        int ret=0;
        while(N>0){
            ret = ret*10 + N%10;
            N/=10;
        }
        return ret;
    }
}