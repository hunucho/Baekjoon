import java.util.*;
import java.io.*;

class Main {
    static int MOD = 1000000000;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()), abs = Math.abs(N);
        int [] fibo = new int [1000001];
        fibo[1]=1;
        for(int i=2;i<= Math.abs(N);i++)
            fibo[i]=(fibo[i-1]+fibo[i-2])%MOD;
        System.out.println(N==0?0:N>0?1:N%2==0?-1:1);
        System.out.print(fibo[abs]);
    }
}