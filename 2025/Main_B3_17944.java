import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), T=sc.nextInt();
        int cnt=1, d=1;
        for(int t=1;t<T;t++){
            cnt+=d;
            if(cnt==2*N || cnt==1)
                d*=-1;
        }
        System.out.println(cnt);
    }
}