import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()), ans=0;
        for(int i=0;i<N;i++){
            int d=Integer.parseInt(br.readLine());
            if(d%2==1)
                ans++;
        }
        System.out.print(ans);
    }
}