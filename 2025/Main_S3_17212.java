import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] coin = new int [100100], arr = {1, 2, 5, 7};
        Arrays.fill(coin, 999999);
        coin[0]=0;
        coin[1]=coin[2]=coin[5]=coin[7]=1;
        for(int i=3;i<=100000;i++){
            for(int j=0;j<4;j++){
                if(i-arr[j]>0)
                    coin[i] = Math.min(coin[i], coin[i-arr[j]] + coin[arr[j]]);
            }
        }
        System.out.print(coin[N]);
    }
}