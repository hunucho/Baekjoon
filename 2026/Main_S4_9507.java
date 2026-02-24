import java.io.*;
import java.util.*;

public class Main {
    static long [] fibo;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        fibo = new long[80];
        for(int i=0;i<70;i++){
            fibo[i] = koong(i);
        }
        for(int t=0;t<T;t++){
            int n = Integer.parseInt(br.readLine());
            System.out.println(fibo[n]);
        }
    }
    static long koong(int n){
        if(n<2)
            return 1;
        else if(n==2)
            return 2;
        else if(n==3)
            return 4;
        if(fibo[n]!=0)
            return fibo[n];
        else
            return koong(n-1)+koong(n-2)+koong(n-3)+koong(n-4);
    }
}