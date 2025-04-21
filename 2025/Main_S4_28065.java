import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()), n=N;
        boolean [] chk = new boolean [N+1];
        StringBuilder sb = new StringBuilder();
        for(int d=N-1;d>=0;d--){
            chk[n]=true;
            sb.append(n+" ");
            if(0<n-d && n-d<N && 0<n+d && n+d<N){
                if(chk[n-d])
                    n=n+d;
                else
                    n=n-d;
            } else if(0<n-d && n-d<N){
                n=n-d;
            } else {
                n=n+d;
            }

        }
        System.out.println(sb);
    }
}