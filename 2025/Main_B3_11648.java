import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()), ans=0;
        while(N>9){
            int tmp=1;
            while(N>0) {
                tmp *= N % 10;
                N/=10;
            }
            N=tmp;
            ans++;
        }
        System.out.print(ans);
    }
}