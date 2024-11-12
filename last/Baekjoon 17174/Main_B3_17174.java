import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), M=sc.nextInt();
        int ans=N;
        while(N>=M){
            N/=M;
            ans+=N;
        }
        System.out.println(ans);
    }
}