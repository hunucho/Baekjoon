import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()), ans=0;
        int [] menu = new int [N+1];
        for(int i=1;i<=N;i++)
            menu[i] = Integer.parseInt(br.readLine());
        int M=Integer.parseInt(br.readLine());
        for(int i=0;i<M;i++)
            ans+=menu[Integer.parseInt(br.readLine())];
        System.out.println(ans);
    }
}