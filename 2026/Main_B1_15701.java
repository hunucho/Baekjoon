import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), ans=0, i=1;
        while(i*i<=N){
            if(N%i==0) {
                if (i * i == N)
                    ans++;
                else
                    ans+=2;
            }
            i++;
        }
        System.out.print(ans);
    }
}
