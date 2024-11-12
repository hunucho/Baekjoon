import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        int [] cnt = new int[10];
        int N,ans=1;
        N=sc.nextInt();
        for(int i=11;i<=N;i=i*10+1){
            if(i<=N)
                ans++;
        }
        System.out.println(ans);
    }
}