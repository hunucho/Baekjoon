import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] A = new int [N];
        for(int i=0;i<N;i++)
            A[i]=Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken()), Y=Integer.parseInt(st.nextToken());
        int absolute=0;
        for(int i=0;i<N;i++)
            if(A[i]>=Y)
                absolute++;
        System.out.print(N*X/100+" "+absolute);
    }
}