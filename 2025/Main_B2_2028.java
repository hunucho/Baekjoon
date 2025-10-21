import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            int N=Integer.parseInt(br.readLine());
            int len = String.valueOf(N).length();
            System.out.println(N==(int)((N*N)%Math.pow(10,len))?"YES":"NO");
        }
    }
}